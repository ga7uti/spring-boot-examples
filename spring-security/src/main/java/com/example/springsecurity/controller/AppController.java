package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    
    @GetMapping
    public String getWelcomeMessage(){
        return "Welcome to Spring Security Demo";
    }

    @GetMapping("/user")
    public String getUserMessage(){
        return "Welcome user ";
    }

    @GetMapping("/admin")
    public String getAdminMessage(){
        return "Welcome admin";
    }
}
