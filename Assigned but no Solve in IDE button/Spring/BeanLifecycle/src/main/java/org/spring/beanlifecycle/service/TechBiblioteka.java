package org.spring.beanlifecycle.service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TechBiblioteka {
    private final List<String> bookTitles = Collections.synchronizedList(new ArrayList<>());

    public void init() {
        bookTitles.add("Clean code");
        bookTitles.add("Art of cooking");
        bookTitles.add("Intro to amalgamations");
        System.out.println("Biblioteka has been initialized: " + bookTitles);

    }

    public void destroy() {
        bookTitles.clear();
        System.out.println("The library has been cleaned: " + bookTitles);
    }
}
