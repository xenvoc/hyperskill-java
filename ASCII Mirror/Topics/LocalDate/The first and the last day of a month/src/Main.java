import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        int startYear = reader.nextInt();
        int startMonth = reader.nextInt();

        LocalDate firstDay = LocalDate.of(startYear, startMonth, 1);
        YearMonth month = YearMonth.from(firstDay);
        LocalDate lastDay = month.atEndOfMonth();
        System.out.println(firstDay + " " + lastDay);

    }
}