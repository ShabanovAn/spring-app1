package JavaCore.tread.metanitThread;

import sun.jvm.hotspot.HelloWorld;

import java.util.concurrent.Exchanger;

public class MyExchanger {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();
        new Thread(new PutThread(ex)).start();
        new Thread(new GetThread(ex)).start();
    }
}

class PutThread implements Runnable {
    Exchanger<String> exchanger;
    String message;

    public PutThread(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        message = "Hello Java";
    }

    @Override
    public void run() {
        try {
            message = exchanger.exchange(message);
            System.out.println("PutThread has received: " + message);
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
class GetThread implements Runnable {
    Exchanger<String> exchanger;
    String message;

    public GetThread(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        message = "Hello World";
    }

    @Override
    public void run() {
        try {
            message = exchanger.exchange(message);
            System.out.println("GetThread has received: " + message);
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

