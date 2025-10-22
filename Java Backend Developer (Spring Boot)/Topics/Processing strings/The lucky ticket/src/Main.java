import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.next();
        int num1 = Character.getNumericValue(input.charAt(0));
        int num2 = Character.getNumericValue(input.charAt(1));
        int num3 = Character.getNumericValue(input.charAt(2));
        int num4 = Character.getNumericValue(input.charAt(3));
        int num5 = Character.getNumericValue(input.charAt(4));
        int num6 = Character.getNumericValue(input.charAt(5));
        int sum1 = num1 + num2 + num3;
        int sum2 = num4 + num5 + num6;
        if (sum1 == sum2) System.out.println("Lucky");
        else System.out.println("Regular");

    }
}