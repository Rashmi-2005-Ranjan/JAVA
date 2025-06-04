package kgcoding.abstraction;

public class Car extends Vehicle {
    private int noOfDoors;
    public Car() {
        super ( 4 );
    }

    @Override
    public void makeStartSound() {
        System.out.println("Car is starting with a vroom sound!");
    }
}
