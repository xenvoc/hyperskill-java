import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String line = reader.nextLine();
        int N = reader.nextInt();
        Scanner lineScanner = new Scanner(line);
        while (lineScanner.hasNextInt()) {
            nums.add(lineScanner.nextInt());
        }
        int minDiff = Integer.MAX_VALUE;
        for (int num : nums)  {
            if (Math.abs(num - N) < minDiff) minDiff = Math.abs(num - N);
        }

        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            if (minDiff < Math.abs(it.next() - N))
                it.remove();
        }
        nums.sort(null);
        nums.forEach((n) -> System.out.print(n + " "));



    }
}