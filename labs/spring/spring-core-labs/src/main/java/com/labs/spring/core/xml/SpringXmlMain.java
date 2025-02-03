package com.labs.spring.core.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlMain {
    public static void main(String[] args) {
        System.out.println("Starting Spring Application... \n");
        // STEP 1: Create IoC Container - supplying metadata configuration and POJOs
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
//        BeanFactory context = new XmlBeanFactory(new FileSystemResource("beans-config.xml"));
        System.out.println("Bean definitions loaded: " + context.getBeanDefinitionNames().length);
        System.out.println(context.getBeanDefinitionCount());
        // STEP 2: Get an instance of Car from the IoC Container
        Car car = context.getBean("corolla", Car.class);

        car.setColor("Red");

        // STEP 3: Use the Car instance
        System.out.println(car);
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Engine: " + car.getEngine().getName());
        System.out.println("Horsepower: " + car.getEngine().getHorsePower());
        System.out.println("Fuel Type: " + car.getEngine().getFuelType());

        Car car1 = context.getBean("corolla", Car.class);
        System.out.println("Car 1: " + car1);

        // STEP 4: Close the IoC Container
        context.close();

    }
}
