package com.labs.spring.core.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringAnnotationMain {
    public static void main(String[] args) {
        // STEP 1: Create IoC Container - supplying metadata configuration and POJOs
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        System.out.println(context);
        System.out.println("Bean definitions loaded: " + context.getBeanDefinitionCount());

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        // STEP 2: Get an instance of Car from the IoC Container
        Car car = context.getBean(Car.class);

        // STEP 3: Use the Car instance
        System.out.println(car);

        // STEP 4: Close the IoC Container
        context.close();


    }
}
