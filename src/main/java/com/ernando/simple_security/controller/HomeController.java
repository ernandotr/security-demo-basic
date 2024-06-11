package com.ernando.simple_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

    @GetMapping("/sec-hello")
    public String secHello() {
        return "Hello, world! Secured.";
    }
}
