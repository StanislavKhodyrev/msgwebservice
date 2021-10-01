package com.vdm.msgwebservice.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.vdm.msgwebservice.dto.AuthenticationRequestDTO;
import com.vdm.msgwebservice.entity.Role;
import com.vdm.msgwebservice.entity.Status;
import com.vdm.msgwebservice.entity.User;
import com.vdm.msgwebservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * @author Stanislav Khodyrev
 */

@Slf4j
@RestController
@RequestMapping("/API/V1/")
public class AuthenticationRestController {

    private final AuthenticationManager authenticationManager;
    private final UserService userService;



    @Autowired
    public AuthenticationRestController(AuthenticationManager authenticationManager, UserService userService) {
        this.authenticationManager = authenticationManager;
        this.userService = userService;
    }

    @PostMapping(path = "/authenticate")
    public JsonObject authenticate(@RequestBody AuthenticationRequestDTO request) {
        try {
            JsonObject jsonObject = new JsonObject();
            String username = request.getLogin();

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, request.getPassword()));
            User user = userService.findByUsername(username);

            if (user == null) {
                throw new UsernameNotFoundException("User with username: " + username + " not found");
            }
            return jsonObject;
        } catch (AuthenticationException e) {
            throw new BadCredentialsException("Invalid username or password");
        }
    }

    @PostMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        SecurityContextLogoutHandler securityContextLogoutHandler = new SecurityContextLogoutHandler();
        securityContextLogoutHandler.logout(request, response, null);
    }

    @PostMapping(path = "/CreateAccount")
    public JsonObject registration(@RequestBody AuthenticationRequestDTO request) {
        log.info("Creating account ...");
        System.out.println(request);
        JsonObject response = new JsonObject();
        String email = request.getEmail();
        String username = request.getLogin();
        if (!userService.existsByEmailAndUsername(email, username)) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(request.getPassword());
            user.setEmail(request.getEmail());
            user.setStatus(Status.NOT_ACTIVE);

            user.setCompany(request.getCompanyName());
            userService.register(user);
            response.addProperty("status", "The request for registration was successfully accepted. " +
                    "Wait for the registration confirmation to be sent to the email address " + user.getEmail());
        } else {
            response.addProperty("status", "User with the same name and email is already registered");
        }
        return response;
    }

    @PostMapping(path = "/refresh")
    public void refresh(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String authorizationHeader = request.getHeader(AUTHORIZATION);
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            try {
                String refreshToken = authorizationHeader.substring("Bearer ".length());
                Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());
                JWTVerifier verifier = JWT.require(algorithm).build();
                DecodedJWT decodedJWT = verifier.verify(refreshToken);
                String username = decodedJWT.getSubject();
                User user = userService.findByUsername(username);
                String accessToken = JWT.create()
                        .withSubject(user.getUsername())
                        .withExpiresAt(new Date(System.currentTimeMillis() + 10 * 60 * 1000))
                        .withIssuer(request.getRequestURL().toString())
                        .withClaim("roles", user.getRoles().stream()
                                .map(Role::getName).collect(Collectors.toList()))
                        .sign(algorithm);

                Map<String, String> tokens = new HashMap<>();

                tokens.put("access_token", accessToken);
                response.addCookie(new Cookie("refresh_token", refreshToken));
                response.setContentType(APPLICATION_JSON_VALUE);
                new ObjectMapper().writeValue(response.getOutputStream(), tokens);

            } catch (Exception e) {
                Map<String, String> errors = new HashMap<>();
                errors.put("error_message", e.getMessage());
                response.setStatus(FORBIDDEN.value());
                response.setContentType(APPLICATION_JSON_VALUE);
                new ObjectMapper().writeValue(response.getOutputStream(), errors);
            }
        } else {
            throw new RuntimeException("Refresh token is missing");
        }

    }

}