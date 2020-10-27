package JavaCore.tread;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        MyThreadForApplication myThread1 = new MyThreadForApplication("One", 1000);
        myThread1.start();
        myThread1.join();

        MyThreadForApplication myThread2 = new MyThreadForApplication("Two", 500);
        myThread2.start();

        MyThreadForApplication myThread3 = new MyThreadForApplication("Three", 700);
        myThread3.start();
        myThread3.interrupt();
    }
}
