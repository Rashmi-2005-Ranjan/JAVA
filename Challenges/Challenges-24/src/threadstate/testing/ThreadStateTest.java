package threadstate.testing;

import threadstate.ThreadState;

public class ThreadStateTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState ( );
        System.out.printf ( "Created The Thread %s\n" , t1.getState ( ) );
        t1.start ();
        t1.join ();
        System.out.printf ( "Thread Finished %s" , t1.getState ( ) );
    }
}
