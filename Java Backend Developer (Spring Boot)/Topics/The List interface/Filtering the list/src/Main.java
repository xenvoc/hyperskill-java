import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        String line = reader.nextLine();
        Scanner lineReader = new Scanner(line);
        while(lineReader.hasNextInt()) {
            nums.add(lineReader.nextInt());
        }
        Iterator<Integer> it = nums.iterator();
        boolean even = true;
        while (it.hasNext()) {
            it.next();
            if (even) it.remove();
            even = !even;
        }
        ListIterator<Integer> it2 = nums.listIterator(nums.size());
        while (it2.hasPrevious()) {
            System.out.print(it2.previous() + " ");
        }
        System.out.println();


    }
}