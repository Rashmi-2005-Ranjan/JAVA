package in.kgcoding.SynchronizeKeyword;

import in.kgcoding.SynchronizeKeyword.counterclass.Counter;
import in.kgcoding.SynchronizeKeyword.updatethread.UpdaterThread;

public class SynchronizeTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis ( );
        Counter counter = new Counter ( );
        UpdaterThread t1 = new UpdaterThread ( counter );
        UpdaterThread t2 = new UpdaterThread ( counter );

        try {
            t1.start ( );
            t2.start ( );
            t1.join ( );
            t2.join ( );
        } catch (InterruptedException e) {
            System.out.println ( "Thread Interrupted: " + e.getMessage ( ) );
        }
        long endTime = System.currentTimeMillis ( );
        System.out.printf ( "Final Counter Value: %d and Time Taken %d ms" ,
                counter.getCount ( ) , (endTime - startTime) );
    }
}
