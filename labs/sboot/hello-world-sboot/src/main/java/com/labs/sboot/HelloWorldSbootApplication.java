package com.labs.sboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
// @Configuration
// @ComponentScan
// @EnableAutoConfiguration
public class HelloWorldSbootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HelloWorldSbootApplication.class, args);

		System.out.println(ctx);
		System.out.println("Bean Count: " + ctx.getBeanDefinitionCount());

		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);

		GreetingService greetingService = ctx.getBean("greetingService",GreetingService.class);
		System.out.println(greetingService.greet("World"));
	}
}
