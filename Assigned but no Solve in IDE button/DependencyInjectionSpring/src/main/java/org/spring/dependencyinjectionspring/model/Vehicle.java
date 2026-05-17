package org.spring.dependencyinjectionspring.model;

public class Vehicle {
    private EngineI engine;

    public Vehicle(EngineI engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
    }
}
