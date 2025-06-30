package questiion2;

import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List<String> flowers = List.of ( "Rose" , "Sunflower" , "Lily" ,
                "Tulip" , "Daisy" , "Orchid" , "Marigold" , "Jasmine" , "Lotus" );
        flowers
                .stream ( )
                .forEach ( flower -> System.out.println ( flower ) );
    }
}
