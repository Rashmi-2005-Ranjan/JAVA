package executor.returningfutures;

import executor.returningfutures.callable.FetchName;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingReturningFutures {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool ( 4 );
        FetchName task1 = new FetchName ( "Prashant" );
        FetchName task2 = new FetchName ( "Ranjan" );
        FetchName task3 = new FetchName ( "Kamlesh" );
        FetchName task4 = new FetchName ( "Sachin" );

        Future<String> name1 = service.submit ( task1 );
        Future<String> name2 = service.submit ( task2 );
        Future<String> name3 = service.submit ( task3 );
        Future<String> name4 = service.submit ( task4 );

        System.out.printf ( "\nFull Name Is : %s " , name1.get ( ) );
        System.out.printf ( "\nFull Name Is : %s " , name2.get ( ) );
        System.out.printf ( "\nFull Name Is : %s " , name3.get ( ) );
        System.out.printf ( "\nFull Name Is : %s " , name4.get ( ) );

        service.shutdown ( );
    }
}
