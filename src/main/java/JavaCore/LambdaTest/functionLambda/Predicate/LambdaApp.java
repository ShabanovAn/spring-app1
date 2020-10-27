package JavaCore.LambdaTest.functionLambda.Predicate;

import java.util.function.Predicate;

public class LambdaApp {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-7));

        Predicate<Integer> predicate = NewPredicat::pred;
        System.out.println(predicate.test(15));

        NewPredicat newPredicat =  new NewPredicat();
        Predicate<Integer> isPos = newPredicat::pred2;
        System.out.println(isPos.test(55));

    }
}
class NewPredicat {
   static boolean pred(int num) {
        return num > 10;
    }

    boolean pred2(int num) {
       return num > 40;
    }
}
