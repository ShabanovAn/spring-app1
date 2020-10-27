package JavaCore.ThreadJavaRush;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test11 {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Runnable task = () -> {
            lock.lock();
            System.out.println("Thread");
            lock.unlock();
        };
        lock.lock();
        Thread t = new Thread(task);
        t.start();
        System.out.println("Main");
        Thread.currentThread().sleep(2000);
        lock.unlock();
    }
}
