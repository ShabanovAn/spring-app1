package test.HomeWorkThread;

public class MainTestThread {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.run();

        Runnable runnable= () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Thread threadм = new Thread(runnable);
        threadм.run();

        Dino dino = new Dino();
        Thread thread = new Thread(dino);
        thread.run();
    }

}
