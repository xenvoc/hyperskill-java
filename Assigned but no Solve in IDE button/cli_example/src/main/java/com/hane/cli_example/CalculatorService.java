package com.hane.cli_example;

import org.springframework.stereotype.Service;

@Service
class CalculatorService {
    public int sum(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}