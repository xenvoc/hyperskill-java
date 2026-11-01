package org.Spring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/main/resources/hyperskill-dataset-125823488.txt"));
        int timestamp = -1;
        int house_number = -1;
        while (scan.hasNextInt()) {
            int unverifiedTimestamp = scan.nextInt();
            int unverifiedHouse = scan.nextInt();
            System.out.print(unverifiedTimestamp + " ");
            System.out.println(unverifiedHouse);
        }


    }
}