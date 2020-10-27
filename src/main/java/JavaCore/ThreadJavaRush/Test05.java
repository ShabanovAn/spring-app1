package JavaCore.ThreadJavaRush;

public class Test05 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                //Do some work
            }
            System.out.println("Finished");
        } ;
        Thread thread = new Thread(runnable);
        thread.start();
        thread.interrupt();
    }
}
