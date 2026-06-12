package org.spring.beanlifecycle.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class TechLibrary {
    private final List<String> bookTitles = Collections.synchronizedList(new ArrayList<>());

   @PostConstruct
    public void init() {
       bookTitles.add("Clean code");
       bookTitles.add("The Art of Computer Programming");
       bookTitles.add("Introduction to Algorithms");
       System.out.println("Library has been initialized: " + bookTitles);
   }

   @PreDestroy
    public void destroy() {
       bookTitles.clear();
       System.out.println("The library has been cleaned: " + bookTitles);
   }
}
