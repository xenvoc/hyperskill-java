package org.spring.dependencyinjectionspring.model;

public class DieselEngine implements EngineI {
    @Override
    public void start() {
        System.out.println("Goes r-r-r-r... and exhausts black smoke");
    }
}
