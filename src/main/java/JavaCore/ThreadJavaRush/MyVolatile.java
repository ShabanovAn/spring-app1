package JavaCore.ThreadJavaRush;

public class MyVolatile {
    public static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Runnable whileFlagFalse = () -> {
            while (!flag) {
            }
            System.out.println("Flag is now True");
        };
        new Thread(whileFlagFalse).start();
        Thread.sleep(1000);
        flag = true;
    }
}
