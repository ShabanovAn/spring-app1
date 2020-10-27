//package JavaCore.tread.metanitThread;
//
// class MyThread implements Runnable{
//    @Override
//    public void run() {
//        System.out.printf("%s started...\n", Thread.currentThread().getName());
//
//        try{
//            Thread.sleep(500);
//        } catch (InterruptedException e)  {
//            System.out.println("Thread has been interrupted");
//        }
//        System.out.printf("%s finished....\n", Thread.currentThread().getName());
//    }
//}
//
//class ProgramRunnable {
//    public static void main(String[] args) {
//        Runnable r = () -> {
//            System.out.printf("%s started ....\n", Thread.currentThread().getName());
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.out.println("Thread has been interrupted");
//            }
//            System.out.printf("%s Finished ....\n", Thread.currentThread().getName());
//        };
//
//        System.out.println("ProgramRunnable started...");
//        Thread myThread = new Thread(r, "MyThread");
//        myThread.start();
//        System.out.println("ProgramRunnable finished....");
//
//    }
//}
