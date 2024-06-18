package com._SoftTche.SpringCICDdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Welcome {
    @GetMapping("/welcome")
    public String message(){
        return "welcome to your CICD Demo";
    }
    @GetMapping("/userDetails")
    public String userDetails(){
        return "add your name and address";
    }

}
