import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // write your code here
        int longestStrLen = -1;
        String longestString = "";
        for (String str : list) {
            if (str.length() > longestStrLen) {
                longestStrLen = str.length();
                longestString = str;
            }
        }
        String finalLongestString = longestString;
        list.replaceAll(s -> finalLongestString);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}