package singleThreadedExecutor;

import printTask.Print;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadedExecutor {
    public static void main(String[] args) {
        ExecutorService service=Executors.newSingleThreadExecutor ();
        Print task1 = new Print ();
        System.out.println ("Task Submitted To Executor Service");
        service.submit ( task1 );
        service.shutdown ();
    }
}
