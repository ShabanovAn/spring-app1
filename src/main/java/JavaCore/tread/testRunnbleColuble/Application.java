package JavaCore.tread.testRunnbleColuble;

import java.util.concurrent.*;

public class Application {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable runnable = () -> {
            System.out.println("Hello World");
        };

        Callable callable = () -> {
            System.out.println("Collable");
            return "COl";
        };


        Thread thread = new Thread(runnable);
        thread.start();


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(runnable);
        Future<String> future = executorService.submit(callable);
        System.out.println(future.get());

    }
}
