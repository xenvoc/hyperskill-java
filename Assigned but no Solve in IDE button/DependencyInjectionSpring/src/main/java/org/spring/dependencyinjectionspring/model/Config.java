package org.spring.dependencyinjectionspring.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

    @Bean
    @Primary
    public Car teslaCar() {
        return new Car("Tesla", "2023");
    }

    @Bean
    public Car toyotaCar() {
        return new Car("Toyota", "2023");
    }
}
