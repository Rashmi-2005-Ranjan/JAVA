public class Car {
    //Properties ====> Instance Variables
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    //Methods ====> Behaviors ====>Instance Methods
    public Car start(){
        if (currentFuelInLiters <= 0) {
            System.out.println("Car is out of fuel cannot start");
        } else if (currentFuelInLiters<5) {
            System.out.println ("Car is low on fuel please refuel");
            currentFuelInLiters--;
        } else{
            System.out.println("Car is started...chihihinhing");
            currentFuelInLiters--;
        }
        return this;
    }
    public void drive() {
            currentFuelInLiters--;
            System.out.println("Car is driving");
    }

    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters+= currentFuelInLiters;
    }

    public float getCurrentFuelLeft() {
        return currentFuelInLiters;
    }
}
