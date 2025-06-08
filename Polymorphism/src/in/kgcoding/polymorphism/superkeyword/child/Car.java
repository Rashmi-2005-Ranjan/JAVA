package in.kgcoding.polymorphism.superkeyword.child;


import in.kgcoding.polymorphism.superkeyword.parent.Vehicle;

public class Car extends Vehicle {
    public Car(int noOfTires){
        super(noOfTires);
    }
    @Override
    public void start() {
        super.getNoOfTires ();
        System.out.println ("Car is starting");
    }
}
