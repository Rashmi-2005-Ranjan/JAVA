package question3;

import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<String> sentences = List.of ( "Rama Is A Good Boy" , "Hello World" , "Good Morning" , "Hii Guys" , "Ha Ha" , "Rashmi" , "Null" , "Sugarcane" );
        String result = sentences
                .stream ( )
                .filter ( sentence -> sentence.length ( ) >= 10 )
                .reduce ( "" , (a , b) -> a + " " + b );
        System.out.println ( result );
    }
}
