import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner reader = new Scanner(System.in);
        BigDecimal Dwalin = new BigDecimal(reader.next());
        BigDecimal Balin = new BigDecimal(reader.next());
        BigDecimal Thorin = new BigDecimal(reader.next());
        System.out.println(Dwalin.add(Balin).add(Thorin));
    }
}