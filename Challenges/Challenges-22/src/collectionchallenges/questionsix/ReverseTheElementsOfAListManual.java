package collectionchallenges.questionsix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseTheElementsOfAListManual {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ("Enter The Size Of The List: " );
        int n=sc.nextInt ( );
        List<Integer>integerList=new ArrayList<> ();
        System.out.println ("Enter The Elements Of The List: " );
        for(int i=0;i<n;i++){
            integerList.add ( sc.nextInt ( ));
        }
        System.out.println ("The Original List Is: " + integerList);
        List<Integer> newList = reverseList(integerList);
        System.out.println ("The Reversed List Is: " + newList);
    }
    public static List<Integer> reverseList(List<Integer> list){
        int start=0,end=list.size ()-1;
        while (start<end){
            Collections.swap ( list,start,end );
            start++;
            end--;
        }
        return list;
    }
}
