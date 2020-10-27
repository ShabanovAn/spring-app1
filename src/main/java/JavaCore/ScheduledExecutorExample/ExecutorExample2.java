package JavaCore.ScheduledExecutorExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//2.1 Мы также можем создать список Callableзадач и запускать их все с помощьюinvokeAll
public class ExecutorExample2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<Callable<Integer>> callableList = Arrays.asList(
                () -> 1,
                () -> 2,
                () -> 3);
        try {
            List<Future<Integer>> futures = executorService.invokeAll(callableList);
            int sum = futures.stream().map(f -> {
                try {
                    return f.get();
                }catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }).mapToInt(Integer::intValue).sum();
            System.out.println(sum);
        }catch (InterruptedException e) { // thread was interrupted
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
    }
}
