public class Car {
    //Properties ====> Instance Variables
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    //Methods ====> Behaviors ====>Instance Methods
    public void drive() {
        if (currentFuelInLiters <= 0) {
            System.out.println("Car is out of fuel");
        } else if (currentFuelInLiters<5) {
            System.out.println ("Car is low on fuel please refuel");
            currentFuelInLiters--;
        } else{
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }
    }

    public void addFuel(float fuel){
        currentFuelInLiters+= fuel;
    }

    public float getCurrentFuelLeft(){
        return currentFuelInLiters;
    }
}
