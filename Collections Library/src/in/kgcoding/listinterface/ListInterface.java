package in.kgcoding.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<> ( );
        strList.add ( "Rashmi" );
        strList.add ( "Ravi" );
        strList.add ( 1 , "Prashant" );
        strList.remove ( 0 );
        if (strList.contains ( "Ravi" )) {
            System.out.println ( "Ravi is present in the list" );
            System.out.println ( "Index of Ravi is: " + strList.indexOf ( "Ravi" ) );
        }
        for (String s : strList) {
            System.out.println ( s );
        }


        //List of Integers
        List<Integer> intList = new ArrayList<> ( );
        intList.add ( 10 );
        intList.add ( 20 );
        intList.add ( 1 , 15 );
        intList.remove ( 0 );
        if (intList.contains ( 20 )) {
            System.out.println ( "20 is present in the list" );
            System.out.println ( "Index of 20 is: " + intList.indexOf ( 20 ) );
        }
        for (Integer integer : intList) {
            System.out.println ( integer );
        }

        //List of Doubles
        List<Double> doubleList = new ArrayList<> ( );
        doubleList.add ( 1.5 );
        doubleList.add ( 2.5 );
        doubleList.add ( 1 , 2.0 );
        doubleList.remove ( 0 );
        if (doubleList.contains ( 2.5 )) {
            System.out.println ( "2.5 is present in the list" );
            System.out.println ( "Index of 2.5 is: " + doubleList.indexOf ( 2.5 ) );
        }
        for (Double aDouble : doubleList) {
            System.out.println ( aDouble );
        }
    }
}
