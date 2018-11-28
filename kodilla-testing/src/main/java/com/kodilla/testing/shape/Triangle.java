package com.kodilla.testing.shape;

public class Triangle implements Shape {
        private double b;
        private double h;

        public Triangle(double b, double h) {
            this.b = b;
            this.h = h;
        }

        public String getName() {
            return "Triangle";
        }

        public double getField(){
            return (b * h) / 2;
        }
}
