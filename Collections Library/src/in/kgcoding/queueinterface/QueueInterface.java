package in.kgcoding.queueinterface;

import in.kgcoding.utility.Utility;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<> ( );
        queue.add ( 1 );
        queue.offer ( 2 );
        queue.add ( 3 );
        queue.offer ( 4 );
        Utility.print ( queue );
        System.out.println ( );
        System.out.println ( "Peak element In Queue Using element(): " + queue.element ( ) );
        System.out.println ( "Peak element In Queue Using peek(): " + queue.peek ( ) );

        System.out.println ("Queue Element Removed Using queue.remove(): "+ queue.remove ( ) );
        Utility.print ( queue );
        System.out.println ( );
        System.out.println ("Queue Element Removed Using queue.poll(): "+ queue.poll ( ) );
        Utility.print ( queue );
        System.out.println ( );
    }
}