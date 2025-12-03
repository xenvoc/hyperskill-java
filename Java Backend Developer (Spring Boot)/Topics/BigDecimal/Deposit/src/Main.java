import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner reader = new Scanner(System.in);
        BigDecimal amount = new BigDecimal(reader.next());
        BigDecimal interest = new BigDecimal(reader.next());
        int years = reader.nextInt();
        BigDecimal multiplier = BigDecimal.ONE.add((interest.divide(new BigDecimal("100")))).pow(years);
        BigDecimal finalAmount = amount.multiply(multiplier);
        finalAmount = finalAmount.setScale(2, RoundingMode.CEILING);
        System.out.println("Amount of money in the account: " + finalAmount);





    }
}