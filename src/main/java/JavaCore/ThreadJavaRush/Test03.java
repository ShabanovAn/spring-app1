package JavaCore.ThreadJavaRush;

public class Test03 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        //2 вариант
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello World");
//            }
//        };
//        Thread thread1 = new Thread();
//        thread1.start();
//    }
        //3
//        Runnable task () -> {
//            System.out.println("Hello World");
//        };
//        Thread thread2 =new Thread(task);
//        thread2.start();

    }

}
