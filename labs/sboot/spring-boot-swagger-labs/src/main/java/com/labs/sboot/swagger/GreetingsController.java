package com.labs.sboot.swagger;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Tag(name = "GreetingsController", description = "Provides various greeting operations")
public class GreetingsController {
    @GetMapping("/greetings")
    @Operation(summary = "Get Greetings message", description = "Returns the greetings message")
    public String greetings() {
        return "Hello, Swagger!";
    }
}
