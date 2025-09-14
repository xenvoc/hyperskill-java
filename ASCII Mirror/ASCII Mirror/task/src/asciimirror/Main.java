package asciimirror;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <String> fileContents;

        int longestLineLength = -1;

        Scanner scanneris = new Scanner(System.in);
        System.out.println("Input the file path:");
        String userInput = scanneris.nextLine();

        // read the file:
        try {
            fileContents = Files.readAllLines(Paths.get(userInput));
            // find longest string:
            for (String currLine : fileContents) {
                if (currLine.length() > longestLineLength) longestLineLength = currLine.length();
            }
            // pad the strings:
            for (int i = 0; i < fileContents.size(); i++) {
                fileContents.set(i, String.format("%-" + longestLineLength + "s", fileContents.get(i)));
            }
            // print:
            for (String currLine : fileContents) {
                System.out.print(currLine + " | ");
                for (int i = currLine.length()-1; i >= 0; i--) {
                    char c = currLine.charAt(i);
                    switch (c) {
                        case '<':
                            c = '>';
                            break;
                        case '>':
                            c = '<';
                            break;
                        case '[':
                            c = ']';
                            break;
                        case ']':
                            c = '[';
                            break;
                        case '{':
                            c = '}';
                            break;
                        case '}':
                            c = '{';
                            break;
                        case '(':
                            c = ')';
                            break;
                        case ')':
                            c = '(';
                            break;
                        case '/':
                            c = '\\';
                            break;
                        case '\\':
                            c = '/';
                            break;
                        default:
                    }
                    System.out.print(c);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("File not found!");
        }




    }
}
