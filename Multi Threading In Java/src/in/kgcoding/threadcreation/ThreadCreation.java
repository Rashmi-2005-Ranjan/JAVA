package in.kgcoding.threadcreation;


import in.kgcoding.threadcreation.usingthreadclass.firsttask.FirstTask;
import in.kgcoding.threadcreation.usingthreadclass.secondtask.SecondTask;
import in.kgcoding.threadcreation.usingthreadclass.thirdtask.ThirdTask;

public class ThreadCreation {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis ( );
        FirstTask t1 = new FirstTask ( );
        SecondTask t2 = new SecondTask ( );
        ThirdTask t3 = new ThirdTask ( );
        System.out.println ( "\nStarting First Thread" );
        t1.start ( );
        System.out.println ( "\nStarting Second Thread" );
        t2.start ( );
        System.out.println ( "\nStarting Third Thread" );
        t3.start ( );
        long endTime = System.currentTimeMillis ( );
        System.out.printf ( " Total Time is %d ms and Current Thread That Is Running %s " , (endTime - startTime) , Thread.currentThread ( ).getName ( ) );
    }
}

