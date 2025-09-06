package com.sfc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String greet() {
        return "Hello world!";
    }
}
