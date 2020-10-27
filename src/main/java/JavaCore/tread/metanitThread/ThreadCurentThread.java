//package JavaCore.tread.metanitThread;
//
//class MyProgram implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.printf("%s started... \n", Thread.currentThread().getName());
//        int counter = 1;
//
//        while (!Thread.currentThread().isInterrupted()) {
//
//            System.out.println("Loop " + counter++);
//        }
//        System.out.printf("%s finished... \n", Thread.currentThread().getName());
//    }
//}
//
//public class ThreadCurentThread {
//    public static void main(String[] args) {
//        System.out.println("Main thread started...");
//        MyProgram myProgram = new MyProgram();
//        Thread t = new Thread(myProgram, "MyThreadPrpgram");
//        t.start();
//        try {
//            Thread.sleep(1000);
//            t.interrupt();
//            Thread.sleep(1000);
//        }catch (InterruptedException e ) {
//            System.out.println("Thread has been interrupted");
//        }
//        System.out.println("Main thread finished...");
//    }
//}
