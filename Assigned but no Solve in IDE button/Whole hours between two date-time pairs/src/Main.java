import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        LocalDateTime input1 = LocalDateTime.parse(reader.next());
        LocalDateTime input2 = LocalDateTime.parse(reader.next());
        long hoursBetween = Duration.between(input1, input2).toHours();
        System.out.println(hoursBetween);


    }
}