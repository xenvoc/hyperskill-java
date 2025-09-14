import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%.2f", new Square(scanner.nextDouble()).getArea());
    }
}

sealed abstract class Shape permits Square {
    abstract double getArea();
}

// implement the Square class here