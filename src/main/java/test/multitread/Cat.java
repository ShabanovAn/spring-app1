package test.multitread;

public class Cat implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {

            }

        }
    }
}
