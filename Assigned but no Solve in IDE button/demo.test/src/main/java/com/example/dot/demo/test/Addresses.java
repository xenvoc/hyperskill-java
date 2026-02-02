package com.example.dot.demo.test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Addresses {
    @Bean
    public String address() {
        return "Yellow Street, 103";
    }
}