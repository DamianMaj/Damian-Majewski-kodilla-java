package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @ Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("The Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> results = oddNumbersExterminator.exterminate(emptyList);

        Assert.assertEquals(0, results.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> results = oddNumbersExterminator.exterminate(numbers);
        Assert.assertEquals( 5, results.size());
    }
}
