package JavaCore.tread.counting;

import javax.sound.midi.Sequence;

public class CounterTest {
    static class Sequence extends Thread {
        private Counter counter;

        public Sequence(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100_000; i++) {
                counter.inc();
            }
        }
    }

    static class UnsafeSequencer extends Thread {
        private LockCounter counter;

        public UnsafeSequencer(LockCounter counter) { this.counter = counter; }

        @Override
        public void run() {
            for (int i = 0; i < 100_000; i++) {
                counter.incUnsafe();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        testCounter();
        //testSafeUnsafe();

    }

    public static void testCounter() throws InterruptedException {
        final int threadNum = 2;
        //Counter counter = new SimpleCounter();
        Counter counter = new AtomicCounter();
        // Counter counter = new LockCounter();
        Thread[] threads = new Thread[threadNum];
        for (int i = 0; i < threadNum; i++) {
            Thread thread = new Sequence(counter);
            threads[i] = thread;
            thread.start();
        }
        for (Thread t : threads) {
            t.join();
        }
        System.out.printf("Thread: %d\nCounter: %d", threadNum, counter);
    }

    public static void testSafeUnsafe() {

    }
}
