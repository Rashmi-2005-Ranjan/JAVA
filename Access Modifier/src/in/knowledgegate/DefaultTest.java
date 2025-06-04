package in.knowledgegate;

import in.kgcoding.Car;

public class DefaultTest {
    public static void main(String[] args) {
        Car car = new Car("Yellow", "Desire", 5, 3000);
        System.out.println (car);

        // Accessing the default class from the same package
        //=====>  Default defaultObj = new Default();
    }
}
