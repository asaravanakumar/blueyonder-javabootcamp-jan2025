package com.labs.scloud.cirbreaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private CircuitBreakerFactory cirBreakerFactory;

    @GetMapping
    public String getOrders() {
        CircuitBreaker cirBreaker = cirBreakerFactory.create("orderCirBreaker");
        RestTemplate restTemplate = new RestTemplate();
        return cirBreaker.run(() -> restTemplate.getForObject("http://localhost:7070/products", String.class),
                throwable -> fallback());
    }

    public String fallback() {
        return "Service is unavailable. Please try again later.";
    }
}
