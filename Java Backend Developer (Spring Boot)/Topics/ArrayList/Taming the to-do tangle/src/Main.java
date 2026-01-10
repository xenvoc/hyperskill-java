import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> taskList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String operation = scanner.nextLine();

            if (operation.equals("add")) {
                String task = scanner.nextLine();
                taskList.add(task);

            } else if (operation.equals("remove")) {
                int index = scanner.nextInt();
                taskList.remove(index);

            } else if (operation.equals("display")) {
                break;

            }
        }
        // output the arraylist
        System.out.print("[");
        if (!taskList.isEmpty()) System.out.print(taskList.get(0));
        for (int i = 1; i < taskList.size(); i++) {
            System.out.print(", " + taskList.get(i));
        }
        System.out.print("]");

        scanner.close();
    }
}