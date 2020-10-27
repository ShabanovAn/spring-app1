package JavaCore.ScheduledExecutorExample;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
//1.1 Запустить Runnable задачу через 5 секунд начальной задержки.
public class ScheduledExecutorRunnable {
    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        Runnable task2 = () -> System.out.println("Running task2...");
        task1();
        ses.schedule(task2,5, TimeUnit.SECONDS);
        task3();

        ses.shutdown();
    }

    public static void task1(){
        System.out.println("Running task1...");
    }

    public static void task3() {
        System.out.println("Running task3...");
    }

}
