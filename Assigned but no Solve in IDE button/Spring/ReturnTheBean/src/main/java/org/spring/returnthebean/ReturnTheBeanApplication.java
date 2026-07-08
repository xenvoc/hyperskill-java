package org.spring.returnthebean;

import org.spring.returnthebean.Config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ReturnTheBeanApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ReturnTheBeanApplication.class, args);
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(context.getBean("bean1"));
        System.out.println(context.getBean("bean2", String.class));
        System.out.println(context.getBean(String.class));
    }

}
