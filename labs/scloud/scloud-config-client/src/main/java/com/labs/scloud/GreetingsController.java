package com.labs.scloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingsController {

    @Value("${welcome.message}"  )
    private String message;

    @GetMapping("/greetings")
    public String greetings() {
        return message;
    }
}
