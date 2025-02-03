package com.labs.spring.core.xml;

public abstract class Engine {
    private String name;
    private String horsePower;
    private String fuelType;
    private String transmission;

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
