import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dataFileLocation = "resources/dataset_91065.txt";
        File dataSetFile = new File(dataFileLocation);
        try {
            Scanner reader = new Scanner(dataSetFile);
            int count = 0;
            while (reader.hasNextInt()) {
                int current = reader.nextInt();
                if (current == 0) break;
                if (current % 2 == 0) count++;
            }
            System.out.println(count);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}