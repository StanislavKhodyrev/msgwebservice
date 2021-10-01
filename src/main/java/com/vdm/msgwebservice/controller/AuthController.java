package com.vdm.msgwebservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/API/V1/")
public class AuthController {

    @GetMapping("/authenticate")
    public String getLoginPage() {
        return "authenticate";
    }

    @GetMapping("/success")
    public String getSuccessPage() {
        return "success";
    }

    @GetMapping("/CreateAccount")
    public String getRegistrationPage() {
        return "CreateAccount";
    }

}
