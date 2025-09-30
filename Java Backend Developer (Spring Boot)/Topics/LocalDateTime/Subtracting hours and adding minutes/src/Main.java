import java.util.Scanner;
import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        LocalDateTime input = LocalDateTime.parse(reader.next());
        int hoursToSubtract = reader.nextInt();
        int minutesToAdd = reader.nextInt();
        System.out.println(input.minusHours(hoursToSubtract).plusMinutes(minutesToAdd));
    }
}