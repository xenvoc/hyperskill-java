import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        LocalTime initial = LocalTime.parse(reader.next());
        int hoursEarlier = reader.nextInt();
        int minutesEarlier = reader.nextInt();
        System.out.println(initial.minusHours(hoursEarlier).minusMinutes(minutesEarlier));
    }
}