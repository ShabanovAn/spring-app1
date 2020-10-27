//package JavaCore.tread.metanitThread;
// class Jtread extends Thread{
//
//    Jtread(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//
//        System.out.printf("%s started... \n", Thread.currentThread().getName());
//        int counterNew=1;
//        while (!isInterrupted()) {
//            System.out.println("Loop" + counterNew++);
//        }
//        System.out.printf("%s finished... \n", Thread.currentThread().getName());
//
//    }
//}
// class ProgramTest {
//    public static void main(String[] args) {
//        String s1 = "TOM";
//        String s2 = "TOM";
//        System.out.println(s1.equals(s2));
////        System.out.println("Main thread started...");
////        Jtread jtread = new Jtread("Jtread");
////        jtread.start();
////
////        try {
////            Thread.sleep(150);
////            jtread.interrupt();
////            Thread.sleep(150);
////        } catch (InterruptedException e) {
////            System.out.println("Thread has been interrupted");
////        }
////        System.out.println("Main thread finished...");
////    }
//
//    }
// }