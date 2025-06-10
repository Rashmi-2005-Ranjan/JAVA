package in.kgcoding.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<> ( );
        map.put ( "Prashant" , 34 );
        map.put ( "Amit" , 30 );
        map.put ( "Rohit" , 28 );
        map.put ( "Suresh" , 40 );
        System.out.println ( map.size ( ) );
        System.out.println ( map.get ( "Prashant" ) );
        System.out.println ( map.containsKey ( "Rohit" ) );
        System.out.println ( map.containsKey ( "Geeta" ) );
        System.out.println ( map.containsValue ( 30 ) );
        System.out.println ( map.containsValue ( 1 ) );
        System.out.println ( map.remove ( "Rohit" ) );
        System.out.println ( map.size ( ) );

//Printing Map Content
        for (String key : map.keySet ( )) {
            System.out.println ( key + " : " + map.get ( key ) );
        }
    }
}
