package com.labs.sboot.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
//@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping("/")
    // @RequestMapping("/home") // Both will work, but using @RequestMapping is a better practice as it allows you to customize the path
    public String home() {
        return "Welcome to the Spring Boot Security Labs!";
    }

    @GetMapping(path = { "/greetings"})
    public String greetings() {
        return "Hello, Security Labs!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello, Admin!";
    }

    @GetMapping("/user")
    public Principal getPrincipal(Principal principal) {
        return principal;
    }
}
