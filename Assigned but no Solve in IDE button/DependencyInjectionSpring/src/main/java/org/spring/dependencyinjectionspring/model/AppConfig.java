package org.spring.dependencyinjectionspring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String address() {
        return "Yellow Street, 104";
    }

    @Bean
    public Customer customer(@Autowired String address) {
        return new Customer("Claire Forsters", address);
    }
}
