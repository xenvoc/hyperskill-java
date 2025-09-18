import java.util.Scanner;

public class Main {
    // implement the method below
    public static void checkNumber (Object o) {
        // your code goes here ...
        switch (o) {
            case Integer i when i > 0 ->System.out.println("Positive integer");
            case Integer i when i == 0 -> System.out.println("Zero");
            case Integer i when i < 0 -> System.out.println("Negative integer");
            default -> System.out.printf("Not an integer");
        }

    }

    // please do not change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            checkNumber(number);
        } catch (NumberFormatException e) {
            checkNumber(input);
        }

        scanner.close();
    }
}