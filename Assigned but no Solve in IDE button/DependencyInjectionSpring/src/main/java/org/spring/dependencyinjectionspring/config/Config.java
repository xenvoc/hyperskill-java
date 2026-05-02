package org.spring.dependencyinjectionspring.config;

import org.spring.dependencyinjectionspring.model.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

    @Bean
    @Primary
    public Car teslaCar() {
        return new Car("Tesler", "1856");
    }

    @Bean
    public Car toyotaCar() {
        return new Car("Toyota", "2023");
    }
}
