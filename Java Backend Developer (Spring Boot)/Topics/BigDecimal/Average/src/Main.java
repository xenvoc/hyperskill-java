import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner reader = new Scanner(System.in);
        BigDecimal num1 = new BigDecimal(reader.next());
        BigDecimal num2 = new BigDecimal(reader.next());
        BigDecimal num3 = new BigDecimal(reader.next());
        BigDecimal result = num1.add(num2).add(num3).divide(new BigDecimal("3"), RoundingMode.DOWN);
        System.out.println(result.setScale(0, RoundingMode.DOWN));


    }
}