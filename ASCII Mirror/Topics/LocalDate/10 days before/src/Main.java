import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        LocalDate input = LocalDate.parse(reader.next());
        System.out.println(input.minusDays(10));
    }
}