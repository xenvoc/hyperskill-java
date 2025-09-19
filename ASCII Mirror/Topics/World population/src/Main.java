import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String worldPopFileLocation = "resources/dataset_91069.txt";
        File worldPopFile = new File(worldPopFileLocation);
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        try {
            Scanner reader = new Scanner(worldPopFile);
            String unneeded = reader.nextLine();
            long lastYearPop = -1;
            long currentPop = 2557628654l;
            long maxDiff = 0;
            int maxDiffYear = -1;
            while (reader.hasNext()) {
               int thisYear = reader.nextInt();
               lastYearPop = currentPop;

               currentPop = Long.parseLong(reader.next().replace(",", ""));
              long thisYearsDiff = currentPop - lastYearPop;
               if (thisYearsDiff > maxDiff) {
                   maxDiff = thisYearsDiff;
                   maxDiffYear = thisYear;
               }
            }
            System.out.println(maxDiffYear);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}