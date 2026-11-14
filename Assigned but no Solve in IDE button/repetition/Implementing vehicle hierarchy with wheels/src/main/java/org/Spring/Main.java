package org.Spring;
import java.util.Scanner;

// Base class for vehicles
class Vehicle {
    protected int numWheels;

    public Vehicle(int wheels) {
        numWheels = wheels;
    }
}

// TODO: Create the Bicycle class that extends Vehicle
class Bycicle extends Vehicle {
    public Bycicle() {
        super(2);
    }

}

// TODO: Create the Motorcycle class that extends Vehicle
class Motorcycle extends Vehicle {
    public Motorcycle() {
        super(2);
    }
}

// TODO: Create the Car class that extends Vehicle

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.nextLine();

        // TODO: Create an instance of the appropriate vehicle class based on vehicleType
        // TODO: Call the printWheels() method on the vehicle instance
    }
}
