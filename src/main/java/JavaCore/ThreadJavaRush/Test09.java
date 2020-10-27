package JavaCore.ThreadJavaRush;

import java.util.concurrent.Semaphore;

public class Test09 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(0);
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World");

    }
}
