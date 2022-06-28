import java.util.concurrent.*;

class SumNumbers implements Callable<Integer>{
    private int n;

    public SumNumbers(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum += i;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("[" + Thread.currentThread().getName() + "] of sum " + sum);
        return sum;
    }
}

public class FutureInterfaceEx1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Thread main started");

        ExecutorService ex= Executors.newSingleThreadExecutor();
        Future<Integer> returnedValues=ex.submit(new SumNumbers(10));

        System.out.println("Result of Future object:: " + returnedValues.get());
        ex.shutdown();

        System.out.println("Thread main finished");

    }
}
