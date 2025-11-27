import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BigInteger M = new BigInteger(reader.next());
        for (long n = 0; n < Long.MAX_VALUE; n++) {
            if (factorial(n).compareTo(M) > -1) {
                System.out.println(n);
                break;
            }
        }
    }
    public static BigInteger factorial(long n) {
        BigInteger nBigInt = BigInteger.valueOf(n);
        if (n == 0) return BigInteger.ONE;
        else return nBigInt.multiply(factorial(n-1));
    }
}