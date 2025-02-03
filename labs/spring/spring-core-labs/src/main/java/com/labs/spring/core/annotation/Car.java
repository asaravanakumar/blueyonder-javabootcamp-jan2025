package com.labs.spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//<bean id="corolla" class="com.labs.spring.core.annotation.Car" scope="singleton" lazy-init="true" />

@Component("corolla" )
@Scope("singleton")
@Lazy
public class Car {
    @Value(value = "Toyota")
    private String make;
    @Value(value = "Corolla")
    private String model;
    @Value(value = "Blue")
    private String color;

//    @Autowired(required = false)
//    @Qualifier("petrolEngine")
    private Engine engine;

    public Car() {
        System.out.println("Creating a new Car instance using default constructor.");
    }

//    @Autowired
//    public Car(@Qualifier("electricEngine") Engine engine) {
//        System.out.println("Creating a new Car instance using constructor with Engine.");
//        this.engine = engine;
//    }

    public Car( Engine engine) {
        System.out.println("Creating a new Car instance using constructor with Engine.");
        this.engine = engine;
    }

    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public Car(String make, String model, String color, Engine engine) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    // Static factory method to create a Car instance
    public static Car getInstance() {
        System.out.println("Creating a new Car instance using static factory method.");
        return new Car();
    }

    public static Car getInstance(String make, String model, String color) {
        System.out.println("Creating a new Car instance using static factory method with args");
        return new Car(make, model, color);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    @Autowired
    public void setEngine(@Qualifier("electricEngine") Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Bean initialization");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Bean destruction");
//    }

}
