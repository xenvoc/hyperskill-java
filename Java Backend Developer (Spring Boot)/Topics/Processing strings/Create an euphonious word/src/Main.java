import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.next();
        String vowels = "aeiouy";
        byte vCount = 0;
        byte cCount = 0;
        byte lettersToInsert = 0;
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                if (vCount == 2) {
                    lettersToInsert++;
                    vCount = 1;
                } else {
                    vCount++;
                    cCount = 0;
                }
            } else {
                if (cCount == 2) {
                    lettersToInsert++;
                    cCount = 1;
                } else {
                    vCount = 0;
                    cCount++;
                }
            }
        }
        System.out.println(lettersToInsert);
    }
}