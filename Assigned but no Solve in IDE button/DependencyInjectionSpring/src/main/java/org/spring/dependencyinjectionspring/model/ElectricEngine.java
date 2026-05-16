package org.spring.dependencyinjectionspring.model;

public class ElectricEngine implements EngineI {
    @Override
    public void start() {
        System.out.println("Goes z-z-z-zap... and produces sparkles");
    }
}
