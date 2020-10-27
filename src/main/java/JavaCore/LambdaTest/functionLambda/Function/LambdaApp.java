package JavaCore.LambdaTest.functionLambda.Function;

import java.util.function.Function;

public class LambdaApp {
    public static void main(String[] args) {
        Function<Integer, String> convert = x-> String.valueOf(x) + " Долларов";
        System.out.println(convert.apply(5));

        Function<Double, Integer> convert1 = newFunction::app;
        System.out.println(convert1.apply(20.53232));


        newFunction newFunction = new newFunction();
        Function<Double, Integer> convert2 = newFunction::app1;
        convert2.apply(20.3442);
    }
}

class newFunction {
    static int app(double t) {
        return (int) t;
    }

    int app1(double t) {
        return (int) t;
    }

}




//public interface Function<T,R> {
//    R apply (T t);
//}
