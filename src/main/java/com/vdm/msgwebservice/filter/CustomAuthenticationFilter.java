package com.vdm.msgwebservice.filter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.vdm.msgwebservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
public class CustomAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    private final AuthenticationManager authenticationManager;

    @Autowired
    public CustomAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.setFilterProcessesUrl("/API/V1/authenticate");
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        log.info("Starting authentication filter...");
        JsonObject jsonObject = getJsonFromBody(request);

        String login = jsonObject.get("Login").toString().replaceAll("\"","");
        log.info("User is: {}", login);
        String password = jsonObject.get("Password").toString().replaceAll("\"","");
        log.info("Password is: {}", password);
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(login, password);

        return authenticationManager.authenticate(authenticationToken);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authentication) throws IOException, ServletException {
        log.info("Starting SUCCESS authentication filter...");
        User user = (User) authentication.getPrincipal();
        Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());
        // subject - уникальное значение пользователя
        // 10 * 60 * 1000 (ms) = 10 (min)
        // 12 * 60 * 60 * 1000 = 12 (h)
        String accessToken = JWT.create()
                .withSubject(user.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + 10 * 60 * 1000))
                .withIssuer(request.getRequestURL().toString())
                .withClaim("roles", user.getAuthorities().stream()
                        .map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .sign(algorithm);

        String refreshToken = JWT.create()
                .withSubject(user.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + 12 * 60 * 60 * 1000))
                .withIssuer(request.getRequestURL().toString())
                .sign(algorithm);

//        response.setHeader("access_token", accessToken);
//        response.setHeader("refresh_token", refreshToken);
        Map<String, String> tokens = new HashMap<>();

        tokens.put("access_token", accessToken);
        //tokens.put("refresh_token", refreshToken);
        response.addCookie(new Cookie("refresh_token", refreshToken));
        response.setContentType(APPLICATION_JSON_VALUE);
        new ObjectMapper().writeValue(response.getOutputStream(), tokens);
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        Map<String, String> errors = new HashMap<>();
        errors.put("error", "user not found in the database or have status NOT ACTIVE");
        response.setContentType(APPLICATION_JSON_VALUE);
        new ObjectMapper().writeValue(response.getOutputStream(), errors);
    }

    private JsonObject getJsonFromBody (HttpServletRequest request) {

        StringBuffer sb = new StringBuffer();
        String line = null;
        JsonObject jsonObject = null;
        try (BufferedReader reader = request.getReader()) {
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                //log.info("response:" + line);
            }
            jsonObject = new JsonParser().parse(sb.toString()).getAsJsonObject();
        } catch (IOException | JsonParseException e) {
            System.out.println(sb.toString());
            e.printStackTrace();
        }
        return jsonObject;
    }
}
