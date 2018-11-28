package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public String getName() {
        return "Square";
    }

    public double getField(){
        return a*a;
    }

}
