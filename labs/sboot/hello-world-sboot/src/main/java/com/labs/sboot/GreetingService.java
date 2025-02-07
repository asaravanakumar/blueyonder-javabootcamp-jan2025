package com.labs.sboot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    private static final Logger log = LoggerFactory.getLogger(GreetingService.class);

    public String greet(String name) {
        log.info("GreetingService greet() called with name: {}", name);  // logging message
        return "Hello, " + name + "!";
    }
}
