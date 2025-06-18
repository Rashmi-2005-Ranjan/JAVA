package collectionchallenges.questiontwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList ( "Bear" , "Lion" , "Ant" , "Zebra");
        System.out.println ( list );
        sortInDescending ( list );
        System.out.println ( list );
    }

    public static void sortInDescending(List<String> strList) {
        Collections.sort ( strList , new java.util.Comparator<String> ( ) {
            @Override
            public int compare(String s1 , String s2) {
                if(s1.equals ( s2 )){
                    return 0;
                }else if(s1.charAt ( 0 )<s2.charAt ( 0 )){
                    return 1;
                }else {
                    return -1;
                }
            }
        } );
    }
}
