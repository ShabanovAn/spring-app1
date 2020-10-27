package JavaCore.ThreadJavaRush;

public class Test02 {
    public static void main(String[] args) {
        Thread th = Thread.currentThread();
        th.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Возникла ошибка " + e.getMessage());
            }
        });
        System.out.println(2/0);
    }
}
