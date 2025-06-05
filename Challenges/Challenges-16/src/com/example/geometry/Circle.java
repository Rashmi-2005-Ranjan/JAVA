package com.example.geometry;

public class Circle {
    private double radius;
    private static final double PI = 3.14159;
    public double calculateArea() {
        return PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
