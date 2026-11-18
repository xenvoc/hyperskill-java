package org.Spring;
import java.util.Scanner;

// Base class for vehicles
class Vehicle {
    protected int numWheels;

    public Vehicle(int wheels) {
        numWheels = wheels;
    }

    public void printWheels() {
        System.out.println(numWheels);
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
class Car extends Vehicle {
    public Car() {
        super(4);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.nextLine();



        // TODO: Create an instance of the appropriate vehicle class based on vehicleType
        Vehicle Vehicle = null;
        switch (vehicleType.toLowerCase()) {
            case "bycicle":
               Vehicle = new Bycicle();
                break;
            case "motorcycle":
                Vehicle = new Motorcycle();
                break;
            case "car":
                Vehicle = new Car();
                break;
            default:
                System.out.println("Please give a valid vehicle type next time");
                return;
        }
        // TODO: Call the printWheels() method on the vehicle instance
        Vehicle.printWheels();
    }
}
