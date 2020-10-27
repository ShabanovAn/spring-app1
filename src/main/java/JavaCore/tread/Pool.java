package JavaCore.tread;

import com.sun.jmx.snmp.tasks.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Pool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Processor available: " + cores);
        ExecutorService service = Executors.newFixedThreadPool(2);
        List<Future> futures = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
          //Future future = service.submit(new MyThread("t#" + i));
          Future future = service.submit(new Task(i * 2));
          futures.add(future);
        }

        System.out.println("1) =========================");

        for (Future f : futures) {
            System.out.println("Result: " + f.get());
        }

        System.out.println("2) ==========================");
    }

    static class Task implements Callable<Integer> {
        int num;

        public Task(int num) {
            this.num = num;
        }

        @Override
        public Integer call() throws Exception {
           int acc = 0;
           try {
               for (int i = 0; i < num; i++) {
                   TimeUnit.SECONDS.sleep(1);
                   acc += i;
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
            return acc;
        }
    }
}
