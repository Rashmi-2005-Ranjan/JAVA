package multiThreadedExecutor;

import printTask.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadedExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool ( 3 );
        PrintTask task1 = new PrintTask ( );
        PrintTask task2 = new PrintTask ( );
        PrintTask task3 = new PrintTask ( );


        service.submit ( task1 );
        service.submit ( task2 );
        service.submit ( task3 );

        service.shutdown ();
        if (!service.awaitTermination ( 10 , TimeUnit.SECONDS )) {
            System.out.println ( "EMERGENCY SHUTDOWN !!!!!!" );
            service.shutdownNow ( );
        }
    }
}
