package in.kgcoding;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car ( );
        car.color = "Red";
        car.model = "Swift";
        car.costOfPurchase = 300000; // This is allowed because costOfPurchase has default access modifier
        // car.fuelLevel = 50.0; // This line would cause an error because fuelLevel is private
        // car.costOfPurchase = 500000; // This line would also cause an error because costOfPurchase is private
        Car car2 = new Car (
                "Black" ,
                "BMW" ,
                1 ,
                5000
        );
        System.out.println ( car );
        System.out.println ( car2 );

        Default def = new Default ( );
    }
}
