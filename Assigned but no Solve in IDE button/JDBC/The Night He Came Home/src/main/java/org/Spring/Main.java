package org.Spring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/main/resources/testSource.txt"));
        int timestamp = -1;
        int house_number = -1;
        long fakeReportCount = 0;

        while (scan.hasNextInt()) {
            int unverifiedTimestamp = scan.nextInt();
            int unverifiedHouse = scan.nextInt();
            int timeDiff = unverifiedTimestamp - timestamp;
            int houseDiff = abs(unverifiedHouse - house_number);
            if (timeDiff >= houseDiff) {
               timestamp = unverifiedTimestamp;
               house_number = unverifiedHouse;
            } else fakeReportCount++;
        }
        System.out.println(fakeReportCount);


    }
}