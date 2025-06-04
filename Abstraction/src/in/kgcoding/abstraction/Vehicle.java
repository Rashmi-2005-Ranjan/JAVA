package in.kgcoding.abstraction;

public abstract class Vehicle {
    private int noOfTires;

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute(){
        System.out.println ("Going...........");
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeStartSound();
}
