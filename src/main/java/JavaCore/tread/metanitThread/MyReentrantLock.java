package JavaCore.tread.metanitThread;

import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLock {
    public static void main(String[] args) {
        NewCommonResource commonResource = new NewCommonResource();
        ReentrantLock reentrantLock = new ReentrantLock();  // создаем заглушку
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new NewCountThread(commonResource, reentrantLock));
            t.setName("Thread " + i);
            t.start();

        }

    }
}

class NewCommonResource {
    int x = 0;

}

class NewCountThread implements Runnable {
    NewCommonResource res;
    ReentrantLock locker;

    public NewCountThread(NewCommonResource res, ReentrantLock lock) {
        this.res = res;
        locker = lock;
    }

    @Override
    public void run() {
        locker.lock();  // устанавливаем блокировку
        try {
            res.x=1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        finally {
            locker.unlock();// снимаем блокировку
        }
    }
}
