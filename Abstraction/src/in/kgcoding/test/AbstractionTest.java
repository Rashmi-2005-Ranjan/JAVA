package in.kgcoding.test;

import in.kgcoding.abstraction.Car;

public class AbstractionTest {
    public static void main(String[] args) {
        // Vehicle veh=new Vehicle ( 4 ); ==> Cannot instantiate the type Vehicle
        Car car=new Car ();
        car.commute ();
        car.makeStartSound ();
    }
}
