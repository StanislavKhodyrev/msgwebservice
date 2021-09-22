//package com.vdm.msgwebservice.security;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.security.core.AuthenticationException;
//
//
//public class JwtAuthenticationException extends AuthenticationException {
//    private HttpStatus httpStatus;
//
//    public HttpStatus getHttpStatus() {
//        return httpStatus;
//    }
//
//    public JwtAuthenticationException(String msg, HttpStatus httpStatus) {
//        super(msg);
//        this.httpStatus = httpStatus;
//    }
//
//    public JwtAuthenticationException(String msg) {
//        super(msg);
//    }
//}