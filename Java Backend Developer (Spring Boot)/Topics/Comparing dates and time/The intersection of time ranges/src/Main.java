import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        LocalTime time1 = LocalTime.parse(reader.next());
        LocalTime time2 = LocalTime.parse(reader.next());
        LocalTime time3 = LocalTime.parse(reader.next());
        LocalTime time4 = LocalTime.parse(reader.next());

        if (time1.isBefore(time3) && time2.isBefore(time3)
                || time1.isAfter(time4) && time2.isAfter(time4))
            System.out.println(false);
        else System.out.println(true);
    }
}