package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        circle.setRadius(radius);
        double area = circle.calculateArea();
        System.out.printf("The area of the circle with radius %.2f is %.2f%n", radius, area);

        Rectangle rectangle = new Rectangle();
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        rectangle.setLength(length);
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        rectangle.setWidth(width);
        double rectangleArea = rectangle.calculateArea();
        System.out.printf("The area of the rectangle with length %.2f and width %.2f is %.2f%n", length, width, rectangleArea);
    }
}
