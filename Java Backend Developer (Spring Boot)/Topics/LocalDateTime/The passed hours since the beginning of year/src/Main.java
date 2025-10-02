import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        LocalDateTime input = LocalDateTime.parse(reader.next());
        long hoursSince = ChronoUnit.HOURS.between(
                LocalDateTime.of(input.getYear(), 1,1,0,0),
                input);
        System.out.println(hoursSince);
    }
}