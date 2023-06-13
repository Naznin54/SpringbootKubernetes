package com.ust.springbootkubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class welcomeController{

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome Naznin";
    }
}
