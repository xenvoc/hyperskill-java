package org.spring.applicationcontext;

import org.spring.applicationcontext.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ApplicationContextApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        //SpringApplication.run(ApplicationContextApplication.class, args);
    }

}
