package in.kgcoding.inheritance;

public class Vehicle {
    //==> Cannot access private members of parent class
    protected int numberOfTires;

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    //    public int numberOfTires;
    public void commute(){
        System.out.println ("I am Going From Place A To Place B Using "+numberOfTires+" Tires");
    }
}
