package JavaCore.LambdaTest.functionLambda.Consumer;

import java.util.function.Consumer;

public class LambdaApp {
    public static void main(String[] args) {
        Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);
        printer.accept(600);

        Consumer<Integer> print1 = NewConsumer::app;
        print1.accept(200);

        NewConsumer newConsumer = new NewConsumer();
        Consumer<Integer> print2 = newConsumer::app1;
        print2.accept(300);



    }
}

class NewConsumer {
     static void app(int t) {
         System.out.println(t * 2);
     }
     void app1(int t) {
         System.out.println(t / 2);
     }
}
