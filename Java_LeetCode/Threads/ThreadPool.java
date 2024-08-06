package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author - yogesh
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable task1 = ()->{System.out.println("Task 1 executing");};
        Runnable task2 = ()->{System.out.println("Task 2 executing");};

        executorService.submit(task1);
        executorService.submit(task2);

        executorService.shutdown();

        ExecutorService executors = Executors.newSingleThreadExecutor();
        Runnable task3 = ()->{System.out.println("Task 3 executing");};
        executors.execute(task3);


    }
}
