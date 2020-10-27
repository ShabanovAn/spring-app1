package JavaCore.tread.runnable;

public class MyRunnable implements Runnable {
    int time = 0;

    private boolean isActive;

    public MyRunnable(int time) {
        this.time = time;
        isActive = true;
    }

    public void disable() {
        isActive = false;
        System.out.println("is Active" + isActive);
    }


    @Override
    public void run() {
        while (isActive) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(time);
                    if(isActive == false) {
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i + " " + Thread.currentThread().getName());

            }
        }
    }
}
