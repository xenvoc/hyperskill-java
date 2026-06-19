package org.spring.applicationcontext.config;

import org.spring.applicationcontext.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Person personMay() {
        return new Person("May");
    }

}
