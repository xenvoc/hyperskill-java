package org.spring.externalresourcesdemoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@SpringBootApplication
@PropertySource("classpath:user.properties")
public class ExternalResourcesDemoAppApplication implements CommandLineRunner {

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(ExternalResourcesDemoAppApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("One dollar = " + environment.getProperty("Yen") + " Yen");
        System.out.println("One dollar = " + environment.getProperty("EGP") + " EGP");
        System.out.println(environment.getProperty("name", "Anon"));
    }

}
