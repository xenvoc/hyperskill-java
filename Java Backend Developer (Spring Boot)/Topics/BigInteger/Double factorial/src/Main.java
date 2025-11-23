import java.math.BigInteger;
import java.util.Scanner;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        // type your java code here
        BigInteger result = BigInteger.valueOf(n);
        if (n == 0) return BigInteger.ONE;
        for (int i = n-2; i > 0; i-=2) {
            BigInteger iBig = BigInteger.valueOf(i);
            result = result.multiply(iBig);
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        System.out.println(calcDoubleFactorial(input));
    }
}