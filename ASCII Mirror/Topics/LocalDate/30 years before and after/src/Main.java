import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        LocalDate givenDate = LocalDate.parse(reader.next());
        System.out.println(givenDate.minusYears(30));
        System.out.println(givenDate.plusYears(30));

    }
}