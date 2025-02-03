package com.labs.spring.aop;

public class GreetingService {

    public String greet(String name) {
        System.out.println("GreetingService.greet() called with parameter: " + name);
        return "Hello, " + name + "!";
    }
}
