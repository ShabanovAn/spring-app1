package JavaCore.LambdaTest.functionLambda.UnaryOperator;

import java.util.function.UnaryOperator;

public class LAmbdaApp {
    public static void main(String[] args) {
        UnaryOperator<Integer> square= x -> x*x;
        System.out.println(square.apply(5));

        UnaryOperator<Integer> unaryOperator = NewUnaryOperator::app;
        unaryOperator.apply(10);

        NewUnaryOperator newUnaryOperator = new NewUnaryOperator();
        UnaryOperator<Integer> integerUnaryOperator = newUnaryOperator::app2;
        integerUnaryOperator.apply(50);
    }
}

class NewUnaryOperator {
    static int app(int t) {
        return t * 2;
    }

    int app2 (int t) {
        return  t / 2;
    }
}










//public interface UnaryOperator<T> {
//    T apply(T t);
//}