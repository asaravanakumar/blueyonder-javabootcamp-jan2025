package com.labs.spring.core.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfiguration {

    @Bean
    public Car corolla() {
        return new Car();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Scope
    @Lazy
    public Car swift() {
        return new Car();
//        return new Car(dieselEngine()); // constructor injection
//        Car swift = new Car();
//        swift.setEngine(electricEngine()); // setter injection
//        return swift;
    }

    @Bean
    public Engine electricEngine() {
        return new ElectricEngine();
    }

    @Bean
    public Engine petrolEngine() {
        return new PetrolEngine();
    }

    @Bean
    public Engine dieselEngine() {
        return new DieselEngine();
    }

}
