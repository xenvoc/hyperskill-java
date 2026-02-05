package com.example.dot.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @Bean
    public Customer customer(@Qualifier("address2") String address) {
        return new Customer("Clair de Lune", address);
    }

   @Bean
   public Customer temporary(@Autowired Customer customer) {
        System.out.println(customer);
        return customer;
   }



}
