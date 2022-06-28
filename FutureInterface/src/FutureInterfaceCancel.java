import java.util.concurrent.*;

public class FutureInterfaceCancel {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Future<Integer> returnedValues = ex.submit(() -> {
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
                sum += i;
            }
            System.out.println("[" + Thread.currentThread().getName() + "] of sum " + sum);
            return sum;
        });

        while (!returnedValues.isDone()) {
            System.out.println("Task is still not done...");
            returnedValues.cancel(true);

        }
        try {
            System.out.println("Result of Future object:: " + returnedValues.get());
        } catch (InterruptedException | ExecutionException e) {

            e.printStackTrace();
        }
        ex.shutdown();

        System.out.println("Thread main finished");
    }
}
