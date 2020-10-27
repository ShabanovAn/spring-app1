//package JavaCore.tread.metanitThread;
//
//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
//
//class JThread extends Thread {
//
//
//    JThread(String name) {
//        super(name);
//    }
//
//    public void run() {
//        System.out.printf("%s started... \n", Thread.currentThread().getName());
//
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            System.out.println("Thread has been interrupted");
//        }
//        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
//    }
//}
//
//class Program {
//    public static void main(String[] args) {
//        System.out.println("My thread started");
//        JThread t = new JThread("JThread");
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            System.out.printf("%s has been interapted", t.getName());
//        }
//        System.out.println("my thred finished");
////        System.out.println("Main Thread started ....");
////        for (int i = 0; i < 6; i++) {
////            new JThread("JTread" + i).start();
////        }
////        System.out.println("My thread finished");
//
////        System.out.println("Main thread started...");
////        new JThread("JTread").start();
////        System.out.println("Main thread finished...");
//
//    }
//}
