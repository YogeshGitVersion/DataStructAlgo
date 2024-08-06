package Threads;

import java.util.concurrent.*;

/**
 * @author - yogesh
 */
public class AsyncCallableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<Integer> task = () ->{
            System.out.println("Inside Waiting....");
            Thread.sleep(2000);
            return 1;
        };

        Future<Integer> future = executorService.submit(task);
        System.out.println("Waiting for the result...");

        System.out.println("Result: " + future.get());




        executorService.shutdown();
    }
}
