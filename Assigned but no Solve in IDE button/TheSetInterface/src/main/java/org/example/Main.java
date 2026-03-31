package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

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

        Set<String> countries = new HashSet<>();

        countries.add("India");
        countries.add("Japan");
        countries.add("Switzerland");
        countries.add("Japan");
        countries.add("Brazil");

        System.out.println(countries);
        System.out.println(countries.contains("Switzerland"));

        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(10);
        sortedSet.add(15);
        sortedSet.add(13);
        sortedSet.add(21);
        sortedSet.add(17);

        System.out.println(sortedSet);

        System.out.println(sortedSet.headSet(15));
        System.out.println(sortedSet.tailSet(15));

        System.out.println(sortedSet.subSet(13, 17));

        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());



    }
}