package JavaCore.tread.runnable;

import JavaCore.tread.MyThreadForApplication;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable1 = new MyRunnable(1000);
        Thread thread1 = new Thread(myRunnable1, "one");
        thread1.start();
        Thread.sleep(5000);
        myRunnable1.disable();
        thread1.join();

        MyRunnable myRunnable2 = new MyRunnable(1000);
        Thread thread2 = new Thread(myRunnable2, "two");
        thread2.start();

        MyThreadForApplication myThread = new MyThreadForApplication("mythread", 500);
        myThread.start();


    }
}
