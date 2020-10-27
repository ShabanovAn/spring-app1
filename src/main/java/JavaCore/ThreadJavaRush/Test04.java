package JavaCore.ThreadJavaRush;

import java.util.concurrent.TimeUnit;

public class Test04 {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        };
        Thread thread  = new Thread();
        thread.start();
        thread.interrupt();
    }
}
