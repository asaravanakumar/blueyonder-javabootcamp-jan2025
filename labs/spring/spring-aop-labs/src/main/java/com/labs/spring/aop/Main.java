package com.labs.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        GreetingService greetingService = context.getBean("greetingService", GreetingService.class);

        System.out.println(greetingService.greet("Yogesh") + "\n");
    }

}
