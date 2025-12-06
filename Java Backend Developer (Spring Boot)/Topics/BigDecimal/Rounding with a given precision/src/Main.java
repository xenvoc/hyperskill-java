import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import static java.math.RoundingMode.HALF_DOWN;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String rationalNumStr = reader.next();
        int newScale = reader.nextInt();
        BigDecimal num = new BigDecimal(rationalNumStr).setScale(newScale, HALF_DOWN);
        System.out.println(num);
    }
}