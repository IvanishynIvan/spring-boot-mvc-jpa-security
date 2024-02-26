package com.ivanishyn.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    // add a request mapping for default page
    @GetMapping("/")
    public String showLanding() {
        return "landing";
    }

    // add a request mapping for /leaders
    @GetMapping("/employees")
    public String showHome() {
        return "home";
    }

    // add a request mapping for /leaders
    @GetMapping("/leaders")
    public String showLeaders() {
        return "leaders";
    }

    // add request mapping for /systems
    @GetMapping("/systems")
    public String showSystems() {
        return "systems";
    }

}









