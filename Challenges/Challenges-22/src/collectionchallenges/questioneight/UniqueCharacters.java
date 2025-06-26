package collectionchallenges.questioneight;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        Set<Character> unique = new HashSet<> ( );
        System.out.println ( "Enter a string to check for unique characters:" );
        String str = input.nextLine ( );
        for (char c : str.toCharArray ( )) {
            unique.add ( c );
        }
        System.out.println ( "The string contains " + unique.size ( ) + " unique characters." );
        System.out.println ( "Unique characters in the string: " + unique );
    }
}
