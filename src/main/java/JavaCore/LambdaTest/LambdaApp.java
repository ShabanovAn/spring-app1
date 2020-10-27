package JavaCore.LambdaTest;

public class LambdaApp {
    public static void main(String[] args) {
        Operation<Integer> operation = new Operation<Integer>() {
            @Override
            public int calculate(Integer x, Integer y) {
                return x + y;
            }
        };

        operation = (x, y) -> x+y;
        int result  = operation.calculate(5, 10);
        System.out.println(result);

    }
}

interface Operation<T> {
    int calculate(T x, T y);
}
