package com.vdm.msgwebservice.filter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

import static java.util.Arrays.stream;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
// фильтрует каждый запрос
public class CustomAuthorisationFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        log.info("Starting authorization filter...");
        List openUrl = Arrays.asList("/", "/API/V1/authenticate", "/API/V1/CreateAccount","/API/V1/refresh");
        if (openUrl.contains(request.getRequestURI())) {
            // передает данные на проверку следующему фильтру
            log.info("request contains openUri, transfer to another filter...");
            filterChain.doFilter(request, response);
        } else {
            log.info("NOT OpenUri request is: {}, continue...", request.getRequestURI());
            String authorizationHeader = request.getHeader(AUTHORIZATION);
            if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
                try {
                    String token = authorizationHeader.substring("Bearer ".length());
                    Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());
                    JWTVerifier verifier = JWT.require(algorithm).build();
                    DecodedJWT decodedJWT = verifier.verify(token);
                    String username = decodedJWT.getSubject();
                    log.info("username from JWT: {}", username);
                    String[] roles = decodedJWT.getClaim("roles").asArray(String.class);
                    System.out.println(roles + " <- ROLES");
                    Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
                    stream(roles).forEach(role -> {
                        authorities.add(new SimpleGrantedAuthority(role));
                    });
                    UsernamePasswordAuthenticationToken passwordAuthenticationToken =
                            new UsernamePasswordAuthenticationToken(username, null, authorities);
                    SecurityContextHolder.getContext().setAuthentication(passwordAuthenticationToken);
                    filterChain.doFilter(request,response);
                } catch (Exception e) {
                    log.error("Error login {}", e.toString());
                    Map<String, String> errors = new HashMap<>();
                    errors.put("error_message", e.getMessage());
                    response.setStatus(FORBIDDEN.value());
                    response.setContentType(APPLICATION_JSON_VALUE);
                    new ObjectMapper().writeValue(response.getOutputStream(), errors);
                }
            } else {
                log.info("authorization filter ANYWAY transfer next");
                filterChain.doFilter(request, response);
            }
        }

    }
}


