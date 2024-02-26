package com.ivanishyn.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    // add request mapping for /showMyLoginPage
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
        return "fancy-login";
    }

    // add request mapping for /access-denied
    @GetMapping("/access-denied")
    public String showAccessDenied() {
        return "access-denied";
    }

}










