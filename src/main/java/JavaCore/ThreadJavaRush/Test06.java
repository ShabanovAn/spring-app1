package JavaCore.ThreadJavaRush;

import java.util.concurrent.TimeUnit;

public class Test06 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
        System.out.println("Finished");
    }
}
