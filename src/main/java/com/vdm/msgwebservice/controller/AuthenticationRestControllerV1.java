//package com.vdm.msgwebservice.controller;
//
//import com.vdm.msgwebservice.dto.AuthenticationRequestDTO;
//import com.vdm.msgwebservice.entity.User;
//import com.vdm.msgwebservice.security.JwtTokenProvider;
//import com.vdm.msgwebservice.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author Stanislav Khodyrev
// */
//
//@RestController
//@RequestMapping("/auth")
//public class AuthenticationRestControllerV1 {
//
//    private final AuthenticationManager authenticationManager;
//    private final UserService userService;
//    private final JwtTokenProvider jwtTokenProvider;
//
//    @Autowired
//    public AuthenticationRestControllerV1(AuthenticationManager authenticationManager, UserService userService, JwtTokenProvider jwtTokenProvider) {
//        this.authenticationManager = authenticationManager;
//        this.userService = userService;
//        this.jwtTokenProvider = jwtTokenProvider;
//    }
//
//    @PostMapping(path = "/login")
//    public @ResponseBody ResponseEntity authenticate(AuthenticationRequestDTO request) {
//        try {
//            String username = request.getUsername();
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, request.getPassword()));
//            User user = userService.findByUsername(username);
//
//            if (user == null) {
//                throw new UsernameNotFoundException("User with username: " + username + " not found");
//            }
//
//            String token = jwtTokenProvider.createToken(username, user.getRoles());
//            Map<Object, Object> response = new HashMap<>();
//            response.put("username", username);
//            response.put("token", token);
//            return ResponseEntity.ok(response);
//        } catch (AuthenticationException e) {
//            throw new BadCredentialsException("Invalid username or password");
//        }
//    }
//
//    @PostMapping("/logout")
//    public void logout(HttpServletRequest request, HttpServletResponse response) {
//        SecurityContextLogoutHandler securityContextLogoutHandler = new SecurityContextLogoutHandler();
//        securityContextLogoutHandler.logout(request, response, null);
//    }
//
//    @PostMapping(path = "/registration")
//    public void registration(AuthenticationRequestDTO request) {
//
//    }
//}