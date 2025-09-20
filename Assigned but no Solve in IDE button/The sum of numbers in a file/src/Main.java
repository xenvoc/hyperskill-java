import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileLocation = "resources/dataset_91033.txt";
        File file = new File(fileLocation);

        try {
            Scanner reader = new Scanner(file);
            long sum = 0;
            while (reader.hasNextInt()) {
                sum+= reader.nextInt();
            }
            System.out.println(sum);
        } catch (IOException e) {
            System.out.println("IO Exception " + e);
        }
    }
}