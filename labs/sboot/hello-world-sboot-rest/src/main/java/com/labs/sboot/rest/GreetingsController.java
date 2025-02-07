package com.labs.sboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    // http://localhost:8080/greetings
    @GetMapping("/greetings")
    public String greet() {
        return "Hello, World!";
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome to the Spring Boot!";
    }
}
