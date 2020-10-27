package JavaCore.ThreadJavaRush;

public class Test08 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        Runnable runnable = () -> {
            synchronized (object) {
                try {
                    object.wait();
                }catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
            System.out.println("thread");
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.currentThread().sleep(3000);
        System.out.println("main");
        synchronized (object) {
            object.notify();
        }
    }
}
