package com._SoftTche.SpringCICDdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/welcome")
    public String message(){
        return "welcome to your CICD Demo";
    }
}
