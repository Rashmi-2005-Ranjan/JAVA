package Filter;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of ( "Apple" , "Banana" , "Cherry" , "Mango" , "Date" );
        System.out.println ( fruits.size ( ) );

        System.out.println ( "**************************************************************" );
        //Normal Or Traditional Approach
        System.out.println ( "Printing Fruits Normally With traditional Approach...." );
        for (String fruit : fruits) {
            System.out.println ( fruit );
        }
        System.out.println ( "**************************************************************" );
        System.out.println ( "Printing Fruits Using Streams and Consumer Interface" );
        fruits.stream ( ).forEach ( new Consumer<String> ( ) {
            @Override
            public void accept(String fruit) {
                System.out.println ( fruit );
            }
        } );
        System.out.println ( "**************************************************************" );
        System.out.println ( "Printing Fruits Using Streams and Lambda" );
        fruits.stream ( )
                .forEach ( fruit -> System.out.println ( fruit ) );
        System.out.println ( "**************************************************************" );
        System.out.println ( "Printing Fruits Using Streams and Lambda and Filter" );
        fruits.stream ( )
                .filter ( fruit -> fruit.endsWith ( "e" ) )
                .forEach ( fruit -> System.out.println ( fruit ) );
    }
}
