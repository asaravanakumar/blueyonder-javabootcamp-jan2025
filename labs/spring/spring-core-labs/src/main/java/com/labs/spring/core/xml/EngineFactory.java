package com.labs.spring.core.xml;

// Factory Bean to create Engine instances
public class EngineFactory {


    // Instance Factory method to create Engine instances based on the provided engineType
    public Engine createEngine(String engineType) {
        System.out.println("Instance Factory method called to create Engine instance. Engine type: " + engineType + "  \n");
        if (engineType.equalsIgnoreCase("diesel")) {
            return new DieselEngine();
        } else if (engineType.equalsIgnoreCase("electric")) {
            return new ElectricEngine();
        } else if (engineType.equalsIgnoreCase("petrol")) {
            return new PetrolEngine();
        } else {
            throw new IllegalArgumentException("Invalid engine type: " + engineType);
        }
    }
}
