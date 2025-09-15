import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner myObj = new Scanner(System.in);
        int year = myObj.nextInt();
        int day1 = myObj.nextInt();
        int day2 = myObj.nextInt();
        int day3 = myObj.nextInt();
        LocalDate date1 = LocalDate.ofYearDay(year, day1);
        LocalDate date2 = LocalDate.ofYearDay(year, day2);
        LocalDate date3 = LocalDate.ofYearDay(year, day3);
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        System.out.println(date3.toString());
    }
}