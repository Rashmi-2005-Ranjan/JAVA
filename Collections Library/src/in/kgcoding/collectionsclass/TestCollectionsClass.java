package in.kgcoding.collectionsclass;

import in.kgcoding.utility.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectionsClass {
    public static void main(String[] args) {
        List<Integer>numList=new ArrayList<> (  );
        numList.add ( 5 );
        numList.add ( 2 );
        numList.add ( 8 );
        numList.add ( -17 );
        Utility.print ( numList );
        System.out.println ( );
        Collections.sort ( numList );
        Utility.print ( numList );
        System.out.println ( );
        Collections.reverse ( numList );
        Utility.print ( numList );
        System.out.println ( );

        /**
        List<Integer> unModifiable=Collections.unmodifiableList ( numList );
        unModifiable.add ( 87 );
         */
    }
}
