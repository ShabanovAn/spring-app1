package JavaCore.ThreadJavaRush;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test07 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Object o = new Object();
        Runnable task = () -> {
            synchronized (o) {
                System.out.println("Hello World");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        synchronized (o) {
            for (int i = 0; i < 8; i++) {
                Thread.currentThread().sleep(1000);
                System.out.println(" " + i);
            }
            System.out.println(".....");
        }
    }
}
