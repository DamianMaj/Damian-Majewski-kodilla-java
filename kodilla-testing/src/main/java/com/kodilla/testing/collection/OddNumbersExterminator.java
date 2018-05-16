package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> numbers;
    ArrayList<Integer> evenNumbers;

    public OddNumbersExterminator() {
        numbers = new ArrayList<Integer>();
        evenNumbers = new ArrayList<Integer>();
    }

    public exterminate(ArrayList<Integer>numbers) {
        for(Integer number: numbers){
            if((number % 2) == 0) {
                evenNumbers.add(number);
            }
        }
    }
}
