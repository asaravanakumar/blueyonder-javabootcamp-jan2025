package com.labs.spring.core.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class PetrolEngine extends Engine {

    public PetrolEngine() {
        this.fuelType = "Petrol";
    }
}
