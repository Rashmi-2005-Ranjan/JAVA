package collectionchallenges.questionfive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseTheElementsOfAListUsingCollectionsClass {
    public static void main(String... args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter the number of elements in the list: " );
        int n = sc.nextInt ( );
        List<Integer> integerList = new ArrayList<> ( );
        System.out.println ( "Enter the elements of the list: " );
        for (int i = 0; i < n; i++) {
            integerList.add ( sc.nextInt ( ) );
        }
        System.out.println ( "The original list is: " + integerList );
        List<Integer> newList = reverseList ( integerList );
        System.out.println ( "The reversed list is: " + newList );
    }

    public static List<Integer> reverseList(List<Integer> list) {
        Collections.reverse ( list );
        return list;
    }
}
