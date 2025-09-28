import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        LocalTime input = LocalTime.ofSecondOfDay(reader.nextInt());
        System.out.println(input);

    }
}