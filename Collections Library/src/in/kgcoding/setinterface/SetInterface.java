package in.kgcoding.setinterface;

import in.kgcoding.utility.Utility;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> names = new HashSet<> ( );
        System.out.println ( "Adding names to the set..." );
        System.out.println ( names.add ( "Rashmi" ) );
        System.out.println ( names.add ( "Ranjan" ) );
        System.out.println ( names.add ( "Ravi" ) );
        System.out.println (names.add ( "Ravi" ) );// Duplicate element, will not be added
        Utility.print ( names );
        System.out.println ( );
        System.out.println ("Size Of The Set: "+names.size () );
        System.out.println (names.contains ( "Rashmi" ) );
        System.out.println (names.remove ( "Ranjan" ) );
        Utility.print ( names );
    }
}