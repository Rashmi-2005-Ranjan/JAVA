package in.kgcoding.Join;


import in.kgcoding.threadpriority.task.PrintTaskPriority;

public class TestingJoinMethod {
    public static void main(String[] args) throws InterruptedException{
        long startTime = System.currentTimeMillis ( );
        PrintTaskPriority p1 = new PrintTaskPriority ( '*' );
        PrintTaskPriority p2 = new PrintTaskPriority ( '$' );
        PrintTaskPriority p3 = new PrintTaskPriority ( '#' );
        Thread t1 = new Thread ( p1 );
        t1.setPriority ( Thread.MIN_PRIORITY ); // Priority Set To 1 (Bcz The Value Of Min Priority is 1)
        t1.start ( );
        System.out.println ("\nThread 1 Start" );
        Thread t2 = new Thread ( p2 );
        t2.setPriority ( Thread.NORM_PRIORITY ); // Priority Set To 5 (Bcz The Value Of Norm Priority is 5)
        t2.start ( );
        System.out.println ("\nThread 2 Start" );
        t1.join ();
        Thread t3 = new Thread ( p3 );
        t3.setPriority ( Thread.MAX_PRIORITY ); // Priority Set To 10 (Bcz The Value Of Max Priority is 10)
        t3.start ( );
        System.out.println ("\nThread 3 Start" );
        long endTime = System.currentTimeMillis ( );
        System.out.printf ( "%s Total Time Taken : %d," ,
                Thread.currentThread ( ).getName ( ) ,
                (endTime - startTime) );
    }
}
