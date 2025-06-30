package callableTask.testFactorial;

import callableTask.FactorialCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFectorial {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool ( 3 );
        List<Future<Integer>> list = new ArrayList<> ( );
        for (int i = 0; i < 10; i++) {
            FactorialCalculator task = new FactorialCalculator ( i );
            list.add ( service.submit ( task ) );
        }
        for (Future<Integer> future : list) {
            System.out.printf ( "\n Result Is : %d " , future.get ( ) );
        }

        service.shutdown ( );
        if (service.awaitTermination ( 10 , TimeUnit.SECONDS )) {
            service.shutdownNow ( );
            System.out.print ( "\nEMERGENCY SHUTDOWN !!!!!" );
        }
    }
}
