import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileDir = "resources/dataset_91007.txt";
        File dataFile = new File(fileDir);
        try {
            Scanner reader = new Scanner(dataFile);
            int max = Integer.MIN_VALUE;
            while (reader.hasNextInt()) {
                int current = reader.nextInt();
                if (max < current) max = current;
            }
            System.out.println(max);

        } catch (IOException e) {
            System.out.println("IOException " + e);
        }
    }
}