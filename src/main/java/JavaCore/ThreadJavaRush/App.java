package JavaCore.ThreadJavaRush;

import java.util.concurrent.atomic.AtomicInteger;

public class App {
    public static int value = 0;
    public static AtomicInteger atomic =new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) {
                value++;
                atomic.incrementAndGet();
            }
        };
        for (int i = 0; i < 3; i++) {
            new Thread(runnable).start();
        }
        Thread.sleep(300);
        System.out.println(value);
        System.out.println(atomic.get());
    }
}
