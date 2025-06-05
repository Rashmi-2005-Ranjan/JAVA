package abstraction.challenge.questionone.subclass;

import abstraction.challenge.questionone.Shape;

public class Square extends Shape {
    @Override
    public void calculateArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}
