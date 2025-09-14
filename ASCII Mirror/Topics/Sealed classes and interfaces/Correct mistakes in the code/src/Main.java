import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());
    }
}

sealed interface ShapeInterface
        permits TriangleInterface { }

sealed class Shape
        permits Triangle, Square, Circle { }


public non-sealed interface TriangleInterface extends ShapeInterface { }

final class Triangle extends Shape implements ShapeInterface { }

protected sealed class Square extends Shape { }