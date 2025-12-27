package com.hane.cli_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;




import java.util.Scanner;

@SpringBootApplication
public class CliExampleApplication {
    @Autowired
    private CalculatorService calculatorService;

	public static void main(String[] args) {
		SpringApplication.run(CliExampleApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter numbers separated by spaces:");
            String input = scanner.nextLine();
            String[] numbersStr = input.split(" ");
            int[] numbers = new int[numbersStr.length];

            for (int i = 0; i < numbersStr.length; i++) {
                try {
                    numbers[i] = Integer.parseInt(numbersStr[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number: " + numbersStr[i]);
                }
            }

            int sum = calculatorService.sum(numbers);
            System.out.println("The sum of the numbers is: " + sum);
        };
    }

}
