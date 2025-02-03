package com.labs.spring.core.annotation;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine extends Engine {

    public ElectricEngine() {
        this.fuelType = "Electric";
    }

}
