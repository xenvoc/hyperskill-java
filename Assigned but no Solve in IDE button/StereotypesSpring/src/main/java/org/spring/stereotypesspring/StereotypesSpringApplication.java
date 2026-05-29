package org.spring.stereotypesspring;

import org.spring.stereotypesspring.service.Dragon;
import org.spring.stereotypesspring.service.Knight;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StereotypesSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(StereotypesSpringApplication.class, args);
        Dragon dragon = new Dragon();
        Knight knight = new Knight(dragon);
        knight.slayDragon();
    }


}
