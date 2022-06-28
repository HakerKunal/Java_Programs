import java.util.Arrays;
import java.util.concurrent.*;

class SumNumbers1 implements Callable<Integer> {
    private int n;

    public SumNumbers1(int n) {
        this.n = n;
    }

    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("[" + Thread.currentThread().getName() + "] Sum " + sum);
        return sum;
    }
}

public class FutureInterfaceInvokeAny {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor= Executors.newFixedThreadPool(5);
        Integer  returnedValue=executor.invokeAny(Arrays.asList(
               new SumNumbers1(50),
               new SumNumbers1(80),
               new SumNumbers1(23),
               new SumNumbers1(43),
               new SumNumbers1(167)
        ));

        System.out.println(returnedValue);

        executor.shutdown();

        System.out.println("Thread main finished");

    }
}
