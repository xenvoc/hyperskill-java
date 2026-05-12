package org.spring.dependencyinjectionspring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    private String name;
    private String model;

    @Qualifier("teslaEngine")
    @Autowired
    private Engine engine;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() { return name; }
    public String getModel() { return model; }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
