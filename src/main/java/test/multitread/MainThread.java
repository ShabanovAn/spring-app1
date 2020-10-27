package test.multitread;

public class MainThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(i);
                } catch (InterruptedException e) {

                }
            }
        };

        TestTread testTread = new TestTread();
        TestTread testTread1 = new TestTread();
        testTread.run();
        testTread1.run();

        Thread thread = new Thread(runnable);
        thread.run();


        Cat cat = new Cat();
        Thread thread1 = new Thread(cat);
       thread1.run();



    }
}
