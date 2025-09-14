import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Implement the Vehicle class

        // TODO: Implement the Car class (extends Vehicle)

        // TODO: Implement the Motorcycle class (extends Vehicle)

        // Read input and create appropriate vehicle object
        String vehicleType = scanner.nextLine();
        String brand = scanner.nextLine();
        int year = Integer.parseInt(scanner.nextLine());

        if (vehicleType.equals("Car")) {
            int numDoors = Integer.parseInt(scanner.nextLine());
            // TODO: Create a Car object and call displayInfo()
        } else if (vehicleType.equals("Motorcycle")) {
            boolean hasSidecar = Boolean.parseBoolean(scanner.nextLine());
            // TODO: Create a Motorcycle object and call displayInfo()
        }

        scanner.close();
    }
}