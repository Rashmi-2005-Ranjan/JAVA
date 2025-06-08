package in.kgcoding.polymorphism.superkeyword.parent;

public abstract class Vehicle {
    private int noOfTires;

    public Vehicle() {
        this.noOfTires = 0;
    }

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public abstract void start();
}
