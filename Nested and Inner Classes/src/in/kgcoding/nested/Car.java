package in.kgcoding.nested;

public class Car {
    private int noOfDoors;
    public void repair(){
        Tyres t=new Tyres ();
    }
    // Nested class
    protected class Tyres{
        private double width;
        private double pressure;
        private String material;

        public void inflate(){
            noOfDoors=4;
        }
    }
}
