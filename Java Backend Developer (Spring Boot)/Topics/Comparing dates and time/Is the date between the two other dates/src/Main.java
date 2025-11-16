import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        LocalDate X = LocalDate.parse(reader.next());
        LocalDate M = LocalDate.parse(reader.next());
        LocalDate N = LocalDate.parse(reader.next());

        double sign1 = Math.signum(X.compareTo(M));
        double sign2 = Math.signum(X.compareTo(N));
        if (sign1 == 1 && sign2 == -1 || sign1 == -1 && sign2 == 1) System.out.println(true);
        else System.out.println(false);




    }
}