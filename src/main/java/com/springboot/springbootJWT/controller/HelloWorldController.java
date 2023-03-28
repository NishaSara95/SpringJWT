package com.springboot.springbootJWT.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping( {"/welcome"})
    public String WelcomePage(){
        return "Welcome to JWT Rest Api";

    }
}
