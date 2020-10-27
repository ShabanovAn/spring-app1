package JavaCore.LambdaTest.functionLambda.BinaryOperator;

import JavaCore.Method.B;

import java.util.function.BinaryOperator;

public class LambdaApp {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x*y;

        System.out.println(multiply.apply(3,5));
        System.out.println(multiply.apply(10 ,-2));

        BinaryOperator<String> binaryOperator = NewBinaryOperator::app;

        System.out.println(binaryOperator.apply("Hello", "World"));

         NewBinaryOperator newBinaryOperator = new NewBinaryOperator();
         BinaryOperator<String> binaryOperator1 = newBinaryOperator::app1;


    }
}
class NewBinaryOperator {
   static String app(String t1, String t2) {

       return t1 + " " + t2;
    }

    String app1(String t1, String t2) {
        return t1 + " " + t2;
    }


}
