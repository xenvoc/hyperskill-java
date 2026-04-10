package org.example;

import java.util.*;

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

        Set<Character> characters = new LinkedHashSet<>();

        for (char c = 'a'; c <= 'k'; c++) {
            characters.add(c);
        }

        System.out.println(characters);

        Set<String> countries2 = new HashSet<>(List.of("India", "Japan", "Switzerland"));

        countries2.addAll(List.of("India", "Germany", "Algeria"));
        System.out.println(countries2);

        countries2.retainAll(List.of("Italy", "Japan", "India", "Germany"));
        System.out.println(countries2);

        countries2.removeAll(List.of("Japan", "Germany", "USA"));
        System.out.println(countries2);

        Set<String> countries3 = new HashSet<>(List.of("India", "Japan", "Algeria"));

        System.out.println(countries3.containsAll(Set.of()));
        System.out.println(countries3.containsAll(Set.of("India", "Japan")));
        System.out.println(countries3.containsAll(Set.of("India", "Germany")));
        System.out.println(countries3.containsAll(Set.of("Algeria", "India", "Japan")));

        System.out.println(Objects.equals(Set.of(1, 2, 3), Set.of(1, 3)));
        System.out.println(Objects.equals(Set.of(1, 2, 3), Set.of(1, 2, 3)));
        System.out.println(Objects.equals(Set.of(1, 2, 3), Set.of(1, 3, 2)));

        Set<Integer> numbers2 = new HashSet<>();

        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);

        System.out.println(Objects.equals(numbers2, Set.of(1, 2, 3)));

        HashSet<String> letters = new HashSet<>();
        letters.add("A");
        letters.add("B");
        letters.add("A");
        letters.add("C");
        letters.add("B");

        System.out.println(letters);

        TreeSet<Integer> numbers3 = new TreeSet<>();
        numbers3.add(1);
        numbers3.add(3);
        numbers3.add(1);
        System.out.println(numbers3.contains(3));
        System.out.println(numbers3.contains(8));


    }
}