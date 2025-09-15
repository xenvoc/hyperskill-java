import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String originalDateStr = sc.next();
        int count = sc.nextInt();
        LocalDate originalDate = LocalDate.parse(originalDateStr);
        LocalDate newDate = originalDate;
        while (newDate.getYear() == originalDate.getYear()) {
            System.out.println(newDate.toString());
            newDate = newDate.plusDays(count);
        }

    }
}