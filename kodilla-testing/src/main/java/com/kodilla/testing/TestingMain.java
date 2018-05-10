package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int addResult = calculator.add(4, 3);
        int subtractResult = calculator.subtract(5, 3);

        if (addResult == 7) {
            System.out.println("Adding test pased");
        } else {
            System.out.println("Adding test failed");

        }
        if (subtractResult == 0) {
            System.out.println("Subtracting test pased");
        } else {
            System.out.println("Subtracting test failed");
        }
    }
}

