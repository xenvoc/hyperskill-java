import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        LocalDateTime input = LocalDateTime.parse(reader.next());
        System.out.println(input.plusHours(11).toLocalDate());
    }
}