package JavaCore.ScheduledExecutorExample;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.concurrent.*;
//1.1 Классический ExecutorServiceпример создания пула потоков из 5 потоков,
// отправки двух задач, получения результата, Futureа также способа обработки исключения.
public class ExecutorExample1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        // Runnable, return void, nothing, submit and run the task async
        executorService.submit(() -> System.out.println("I`m runnable task"));

        // Callable, return a future, submit and run the task async
        Future<Integer> future = executorService.submit(() -> {
            System.out.println("I`m Callable task");
            return 1 + 1;
        });
          /* Before Java 8
        executor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm Runnable task.");
            }
        });

        Future<Integer> futureTask1 = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                System.out.println("I'm Callable task.");
                return 1 + 1;
            }
        });*/

        try {
            otherTask("Before Future Result");
            // block until future returned a result,
            // timeout if the future takes more than 5 seconds to return the result
            Integer result = future.get(5, TimeUnit.SECONDS);
            System.out.println("Get future result: " + result);
            otherTask("After Future Result");

        } catch (InterruptedException e) { // thread was interrupted
            e.printStackTrace();
        } catch (ExecutionException e) { // thread threw an exception
            e.printStackTrace();
        } catch (TimeoutException e) { // timeout before the future task is complete
            e.printStackTrace();
        } finally {
            // shut down the executor manually
            executorService.shutdown();
        }
    }
    private static void otherTask(String name) {
        System.out.println("I`m other task.... " + name);

    }
}
