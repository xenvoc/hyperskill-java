class Main {
    public static void main(String[] args) {
        int greatestPrimeInRange = 2;
        for (int number = 2; number <= 460; number++) {
            if (isPrime(number) && number > greatestPrimeInRange) {
                greatestPrimeInRange = number;
            }
        }
        System.out.println(greatestPrimeInRange);
    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i != 0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}