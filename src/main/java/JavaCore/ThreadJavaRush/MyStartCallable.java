package JavaCore.ThreadJavaRush;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class MyStartCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable task = () -> {
            return "Hello world";
        };
        FutureTask<String> futureTask = new FutureTask<>(task);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());

    }
}
