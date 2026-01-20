import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        Scanner lineReader = new Scanner(line);
        List<String> output = new ArrayList<>();
        while (lineReader.hasNext()) {
            output.add(lineReader.next());
        }
        System.out.println(output);
    }
}