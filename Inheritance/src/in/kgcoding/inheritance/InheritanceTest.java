package in.kgcoding.inheritance;

import in.kgcoding.testpackage.TwoWheeler;

public class InheritanceTest {
    public static void main(String[] args) {
        System.out.println ("Welcome to Inheritance Test");
        System.out.println ("---------------------------------");
        System.out.println ("Vehicle");
        Vehicle vehicle=new Vehicle ();
        vehicle.commute ();
        System.out.println (vehicle.toString ());
        System.out.println (vehicle.hashCode () );
        System.out.println (vehicle.getClass () );

        System.out.println ("---------------------------------");
        System.out.println ("TwoWheeler");
        TwoWheeler twoWheeler=new TwoWheeler ();
        twoWheeler.commute ();
        twoWheeler.balance ();

        System.out.println ("---------------------------------");
        System.out.println ("MotorCycle");
        MotorCycle motorCycle=new MotorCycle ();
        motorCycle.commute ();
        motorCycle.balance ();
        motorCycle.start ();
    }
}
