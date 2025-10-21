import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String sub = reader.next();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i + sub.length() <= input.length() && input.substring(i, i +sub.length()).equals(sub)) {
               count++;
               i += sub.length();
            }
        }
        System.out.println(count);
    }
}