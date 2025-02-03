package com.labs.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfiguration {
    // Define bean for GreetingService
    @Bean
    public GreetingService greetingService() {
        return new GreetingService();
    }

    // Define bean for LoggingAspect
    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
