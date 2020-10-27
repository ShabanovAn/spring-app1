package JavaCore.tread.metanitThread;

import java.util.concurrent.Semaphore;

public class MySemaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);//1 разрешение
        CommonResourses res = new CommonResourses();
        new Thread(new CountThreadNew(res, semaphore, "CountThread 1")).start();
        new Thread(new CountThreadNew(res, semaphore, "CountThread 2")).start();
        new Thread(new CountThreadNew(res, semaphore, "CountThread 3")).start();
    }
}

class CommonResourses {
    int x =0;
}

class CountThreadNew implements Runnable {
    CommonResourses res;
    Semaphore sem;
    String name;

    public CountThreadNew(CommonResourses res, Semaphore sem, String name) {
        this.res = res;
        this.sem = sem;
        this.name = name;
    }


    @Override
    public void run() {
         try {
             System.out.println(name + " ожидает разрешение");
             sem.acquire();//Для получения разрешения у семафора
             // надо вызвать метод acquire(), который имеет две формы:
             res.x =1;
             for (int i = 0; i < 5; i++) {
                 System.out.println(this.name + ": " + res.x);
                 res.x++;
                 Thread.sleep(100);
                 
             }
         }
         catch (InterruptedException e) {
             System.out.println(e.getMessage());}
        System.out.println(name + " освобождает разрешение" );
        sem.release(); //После окончания работы с ресурсом полученное
        // ранее разрешение надо освободить с помощью метода release():
         }
    }

