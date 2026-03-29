package org.example;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String>  emptySet = Set.of();
        Set<String> people = Set.of("Larry", "Kenny", "Sabrina");
        Set<Integer> numbers = Set.of(100, 200, 300, 400);

        System.out.println(emptySet);
        System.out.println(people);
        System.out.println(numbers);

        System.out.println(emptySet.contains("hello"));
        System.out.println(people.contains("Sabrina"));
        System.out.println(people.contains("John"));
        System.out.println(numbers.contains(300));

    }
}