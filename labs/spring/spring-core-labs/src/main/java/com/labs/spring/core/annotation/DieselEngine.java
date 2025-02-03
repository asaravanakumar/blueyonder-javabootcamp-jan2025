package com.labs.spring.core.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DieselEngine extends Engine {

    public DieselEngine() {
        this.fuelType = "Diesel";
    }
}
