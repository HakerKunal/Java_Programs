import java.util.concurrent.*;

public class FutureInterfaceLambdada {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex= Executors.newSingleThreadExecutor();
        Future<Integer> returnedValues=ex.submit(()->{
            int sum = 0;
            for (int i = 1; i <= 5; i++) {

                sum += i;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("[" + Thread.currentThread().getName() + "] of sum " + sum);
            return sum;
        });

        System.out.println("Result of Future object:: " + returnedValues.get());
        ex.shutdown();

        System.out.println("Thread main finished");
    }
}
