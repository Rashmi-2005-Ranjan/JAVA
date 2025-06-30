package executor.singleThread;

import executor.printtask.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
    public static void main(String[] args) {
        //Create a single thread executor by using executor service
        ExecutorService service = Executors.newSingleThreadExecutor ( );
        PrintTask task1 = new PrintTask ( '*' );
        PrintTask task2 = new PrintTask ( '#' );
        PrintTask task3 = new PrintTask ( '@' );

        //Submit the tasks to the executor service
        service.submit ( task1 );
        service.submit ( task2 );
        service.submit ( task3 );

        //Shutdown the executor service
        service.shutdown ( );
    }
}
