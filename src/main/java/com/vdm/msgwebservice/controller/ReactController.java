package com.vdm.msgwebservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReactController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/messages")
    public String messages() {
        return "index";
    }

}
