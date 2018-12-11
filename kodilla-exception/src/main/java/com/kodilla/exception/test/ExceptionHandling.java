package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result;

        try {
           result = secondChallenge.probablyIWillThrowException(2, 2);
           System.out.println("result" + result);

        } catch (Exception e) {
            System.out.println(" X has to be between 1.0 and 2.0 and y has to be other than 1.5");
        }
        finally {
            System.out.println(result);
        }
    }
}
