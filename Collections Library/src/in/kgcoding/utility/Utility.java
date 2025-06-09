package in.kgcoding.utility;

import java.util.Collection;

public class Utility {
    public static<E> void print(Collection<E> collection){
        System.out.print ("Collection Elements: ");
        for (E coll:collection) {
            System.out.printf ("%s ",coll);
        }
    }
}
