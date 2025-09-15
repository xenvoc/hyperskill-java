import java.time.LocalDate;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        LocalDate input = LocalDate.parse(reader.nextLine());
        System.out.println(input.plusDays(14));
    }
}