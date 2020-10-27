package JavaCore.tread;

public class MyThreadForApplication extends Thread {
    int time = 0;

    public MyThreadForApplication() {

    }

    public MyThreadForApplication(String name, int time) {
        super(name);
        this.time = time;
    }

    public MyThreadForApplication(String s) {
        super(s);
    }


    @Override
    public void run() {
        while (isInterrupted()) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i + " " + this.getName());

            }
        }

    }
}
