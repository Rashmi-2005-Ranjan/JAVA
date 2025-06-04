package in.knowledgegate;

import in.GetterAndSetters.Car;

public class GetterSetterTest {
    public static void main(String[] args) {
        Car car=new Car ( "Red", "Toyota", 50.0, 200000 );
        System.out.printf ("%s %s",car.getColor (),car.getModel ());
    }
}
