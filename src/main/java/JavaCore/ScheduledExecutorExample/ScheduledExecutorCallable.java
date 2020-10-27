package JavaCore.ScheduledExecutorExample;

import java.util.concurrent.*;
//1.2 Запустить Callable задачу через 5 секунд начальной задержки.
public class ScheduledExecutorCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        Callable<Integer> task2 =  () -> 10;

        task1();
        ScheduledFuture<Integer> scheduled = ses.schedule(task2, 5, TimeUnit.SECONDS);
        task3();

        System.out.println(scheduled.get());
        System.out.println("shutdown!");
        ses.shutdown();
    }

    public static void task1() {
        System.out.println("Running task1...");
    }

    public static void task3() {
        System.out.println("Running task3...");
    }

}
