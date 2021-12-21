package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {
    
    @GetMapping
    public String getWelcomeMessage(){
        return "Welcome to Spring Security Demo";
    }

    @GetMapping("/user/{name}")
    public String getUserMessage(@PathVariable String name){
        return "Welcome to Spring Security Demo" + name;
    }

    @GetMapping("/admin/{name}")
    public String getAdminMessage(@PathVariable String name){
        return "Welcome to Spring Security Demo" + name;
    }
}
