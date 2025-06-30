package callableTask;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Integer> {
    private final int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep ( 2000 );
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
