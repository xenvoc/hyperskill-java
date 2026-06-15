package org.spring.beanlifecycle.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class TechLibrary implements InitializingBean, DisposableBean {
    private final List<String> bookTitles = Collections.synchronizedList(new ArrayList<>());

   @Override
   public void afterPropertiesSet() throws Exception {
       bookTitles.add("Clean Code");
       bookTitles.add("Art of programming computers or so");
       bookTitles.add("Intro to algos, third edition I'd guess");
       System.out.println("Library has been initialized: " + bookTitles);
   }

    @Override
    public void destroy() {
       bookTitles.clear();
       System.out.println("The library has been cleaned: " + bookTitles);
   }
}
