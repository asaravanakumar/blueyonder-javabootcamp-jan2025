package com.labs.spring.core.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    private String make;
    private String model;
    private String color;

//    @Autowired
//    @Qualifier("petrolEngine")
    private Engine engine;

    public Car() {
        System.out.println("Creating a new Car instance using default constructor.");
    }

    public Car(Engine engine) {
        System.out.println("Creating a new Car instance using constructor with Engine.");
        this.engine = engine;
    }

    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

//    public Car(String make, Integer model, String color) {
//        System.out.println("Model is not a valid integer. Using default model 0." + model);
//        this.make = make;
//        this.color = color;
//    }



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

    public void setEngine(Engine engine) {
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

    public void init() {
        System.out.println("Initializing Car instance");
    }

    public void destroy() {
        System.out.println("Destroying Car instance");
    }
}
