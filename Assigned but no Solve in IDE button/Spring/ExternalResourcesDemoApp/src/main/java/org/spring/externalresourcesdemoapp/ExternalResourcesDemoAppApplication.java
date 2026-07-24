package org.spring.externalresourcesdemoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import java.util.List;
import java.util.Random;


@SpringBootApplication
@PropertySources({
        @PropertySource("classpath:user.properties"),
        @PropertySource("classpath:landmark.properties")

})
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
        System.out.println("Most famous-special-extraordinary landmark from France is " + environment.getProperty("france"));

        List<String> landmarks = List.of(environment.getProperty(egypt).split(","));
        Random random = new Random();

        System.out.println("Another famous landmark from Egypt is " + landmarks.get(random.nextInt(landmarks.size())));
    }

}
