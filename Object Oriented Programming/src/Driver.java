public class Driver {
    public static void main(String[] args) {
        Car myCar=new Car ();
        myCar.addFuel (6);
        myCar.drive ();
        System.out.println (myCar.getCurrentFuelLeft ());
        myCar.drive ();
        System.out.println (myCar.getCurrentFuelLeft ());
        myCar.drive ();
        System.out.println (myCar.getCurrentFuelLeft ());
        myCar.addFuel ( 5);
        myCar.drive ();
        System.out.println (myCar.getCurrentFuelLeft ());
    }
}
