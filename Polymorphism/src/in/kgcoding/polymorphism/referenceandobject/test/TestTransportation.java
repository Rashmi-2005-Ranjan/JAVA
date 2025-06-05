package in.kgcoding.polymorphism.referenceandobject.test;

import in.kgcoding.polymorphism.referenceandobject.child.Car;
import in.kgcoding.polymorphism.referenceandobject.child.Plane;
import in.kgcoding.polymorphism.referenceandobject.parent.Vehicle;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car ( );
        Vehicle v = new Vehicle ( );
        Plane p = new Plane ( );
        /**
        casTest ( v );
        casTest ( p );
        */
        casTest ( c );


        // Reference type Vehicle, Object type Car
        // This is polymorphism
        // A reference of type Vehicle can refer to an object of type Car
        // This is called upcasting
        //Means The Object of Child Class Can be assignable to Parent Class

        /*Vehicle vcar = new Car ( );*/

        // Reference type Car, Object type Vehicle
        // This is not polymorphism
        // A reference of type Car cannot refer to an object of type Vehicle
        // This will cause a compile-time error
        // Uncommenting the line below will cause a compile-time error
        // Car cVehicle=new Vehicle ();
        // This is also not polymorphism
        // A reference of type Vehicle cannot be cast to an object of type Car
        // Uncommenting the line below will cause a ClassCastException at runtime


        /*Car cVehicle = (Car) new Vehicle ( );*/

        // Object is the root class of all classes in Java
        // Any class can be assigned to an Object reference
        // This is not polymorphism, but it shows that any class can be assigned to an Object reference
        // This is a reference of type Object, which can refer to any object
        /*Object obj = new Car ( );*/
    }

    private static void casTest(Vehicle vehicle){
        Car cVehicle = (Car) vehicle;
        ((Car) vehicle).noOfDoors ();
        cVehicle.start ( );
        cVehicle.noOfDoors ();
    }
}
