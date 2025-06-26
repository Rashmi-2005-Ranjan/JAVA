package challenges.questiontwo.map;

import java.util.Map;
import java.util.Scanner;

public class Country {
    public static void main(String[] args) {
        Map<String, String> map = Map.ofEntries(
                Map.entry("India", "New Delhi"),
                Map.entry("USA", "Washington D.C."),
                Map.entry("Canada", "Ottawa"),
                Map.entry("Mexico", "Mexico City"),
                Map.entry("UK", "London"),
                Map.entry("France", "Paris"),
                Map.entry("Germany", "Berlin"),
                Map.entry("Italy", "Rome"),
                Map.entry("Spain", "Madrid"),
                Map.entry("Japan", "Tokyo"),
                Map.entry("China", "Beijing")
        );
        Scanner sc=new Scanner ( System.in );
        System.out.println ("Enter The Name Of The Country For Finding Capital Of That Country: ");
        String country=sc.nextLine ();
        String res;
        if(map.containsKey ( country )){
            System.out.println ("The Capital Is "+map.get ( country ) );
        }else {
            System.out.println ("Country Is Not Present");
        }
    }
}