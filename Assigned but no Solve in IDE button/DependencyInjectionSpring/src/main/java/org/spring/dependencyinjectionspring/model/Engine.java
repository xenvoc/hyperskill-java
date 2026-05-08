package org.spring.dependencyinjectionspring.model;

public class Engine {
    private String brand;
    private boolean isRunning;

    public Engine(String brand, boolean isRunning) {
        this.brand = brand;
        this.isRunning = isRunning;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

     public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
     }

     public boolean getIsRunning() {
        return isRunning;
     }
}
