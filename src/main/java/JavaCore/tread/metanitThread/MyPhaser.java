package JavaCore.tread.metanitThread;

import java.util.concurrent.Phaser;

public class MyPhaser {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        new Thread(new PhaseThread(phaser, "PhaseThread 1")).start();
        new Thread(new PhaseThread(phaser, "PhaseThread 2")).start();

        // ждем завершения фазы 0
        int phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + phase + " завершена");
        // ждем завершения фазы 1
        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + phase + " завершена");


        // ждем завершения фазы 3
        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + phase + " завершена");

        phaser.arriveAndDeregister();

    }
}

class PhaseThread implements Runnable {

    Phaser phaser;
    String name;

    public PhaseThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    @Override
    public void run() {
        System.out.println(name + " выполняем фазу " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance();//Сообщает что первая фаза достигнута
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(name + " выполняем фазу " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance(); //Сообщает что вторая фаза достигнута
        try{
            Thread.sleep(200);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(name + " выполняем фазу " + phaser.getPhase());
        phaser.arriveAndDeregister();// сообщаем о завершении фаз и удаляем с регистрации объекты

    }
}
