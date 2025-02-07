package com.labs.sboot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class HelloWorldSbootRestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HelloWorldSbootRestApplication.class, args);
		System.out.println(ctx);
		System.out.println("Bean Count: " + ctx.getBeanDefinitionCount());

		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
