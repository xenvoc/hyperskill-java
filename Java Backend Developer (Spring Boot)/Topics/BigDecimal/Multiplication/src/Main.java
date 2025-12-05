import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner reader = new Scanner(System.in);
        BigDecimal num1  = new BigDecimal(reader.next());
        BigDecimal num2  = new BigDecimal(reader.next());
        BigDecimal product = num1.multiply(num2);
        System.out.println(product);

    }
}