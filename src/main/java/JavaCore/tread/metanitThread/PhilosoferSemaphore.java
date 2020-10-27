package JavaCore.tread.metanitThread;

import java.util.concurrent.Semaphore;

public class PhilosoferSemaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 1; i < 6; i++) {
            new Philosopher(semaphore, i).start();

        }
    }
}

//Класс филосовфа
class Philosopher extends Thread {
    Semaphore sem; // семафор. ограничивающий число философов
    int num = 0;   // кол-во приемов пищи
    int id;  // условный номер философа

    // в качестве параметров конструктора передаем идентификатор философа и семафор
    Philosopher(Semaphore sem, int id) {
        this.sem = sem;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (num < 3) { // пока количество приемов пищи не достигнет 3
                sem.acquire(); //Запрашиваем у семафора разрешение на выполнение
                System.out.println("Философ " + id + " садится за стол");
                sleep(500); //философ ест
                num++;
                System.out.println ("Философ " + id+" выходит из-за стола");
                sem.release();
                sleep(500); //Философ гуляет
            }
        }
        catch (InterruptedException e) {
            System.out.println("у философа " + id + " проблемы со здоровьем");
        }
    }
}