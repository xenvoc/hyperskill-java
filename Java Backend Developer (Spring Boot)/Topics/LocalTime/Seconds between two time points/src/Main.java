import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        LocalTime inst1 = LocalTime.parse(scanner.next());
        LocalTime inst2 = LocalTime.parse(scanner.next());
        System.out.println(Math.abs(inst2.toSecondOfDay() - inst1.toSecondOfDay()));

    }
}