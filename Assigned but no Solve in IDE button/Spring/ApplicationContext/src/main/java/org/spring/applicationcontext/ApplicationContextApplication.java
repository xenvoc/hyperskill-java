package org.spring.applicationcontext;

import org.spring.applicationcontext.config.Config;
import org.spring.applicationcontext.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ApplicationContextApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        System.out.println(context.getBean(Person.class));
        SpringApplication.run(ApplicationContextApplication.class, args);
        System.out.println(context.getBean("personMay"));
        System.out.println(context.getBean("personMay", Person.class));
    }

}
