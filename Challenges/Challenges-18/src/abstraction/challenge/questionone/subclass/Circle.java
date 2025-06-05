package abstraction.challenge.questionone.subclass;

import abstraction.challenge.questionone.Shape;

public class Circle extends Shape {
    @Override
    public void calculateArea( double radius) {
        double area=Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
