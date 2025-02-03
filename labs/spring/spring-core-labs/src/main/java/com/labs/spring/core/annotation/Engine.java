package com.labs.spring.core.annotation;

import org.springframework.beans.factory.annotation.Value;

public abstract class Engine {
    @Value(value = "Toyota Prius" )
    protected String name;
    @Value(value = "180 HP")
    protected String horsePower;
    protected String fuelType;
    @Value(value = "Automatic")
    protected String transmission;

    public Engine() {
        System.out.println("Creating a new Engine instance using default constructor.");
    }

    public Engine(String name, String horsePower, String fuelType, String transmission) {
        this.name = name;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
        this.transmission = transmission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", horsePower='" + horsePower + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
