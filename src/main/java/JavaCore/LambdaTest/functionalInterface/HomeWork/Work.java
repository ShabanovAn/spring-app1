package JavaCore.LambdaTest.functionalInterface.HomeWork;

import java.util.function.*;

public class Work {

    private static String string;

    public static void main(String[] args) {
        WorkPlaner workPlaner = () -> System.out.println("Hello");
        workPlaner.planer();

        WorkPlaner workPlaner1 = Box::printStatic;
        workPlaner1.planer();

        Box box = new Box();
        WorkPlaner workPlaner2 = box::print;
        workPlaner2.planer();

        Predicate<String> stringPredicate = x -> x.length() > 5;
        System.out.println(stringPredicate.test("You Work ?"));

        BinaryOperator<Integer> integerBinaryOperator = (x, y) -> x + y;
        System.out.println(integerBinaryOperator.apply(5, 7));

        UnaryOperator<Integer> integerUnaryOperator = x -> x * x;
        System.out.println(integerUnaryOperator.apply(5));

        Function<Integer, String> function = x -> String.valueOf(x) + " Рублей";
        System.out.println(function.apply(5));

        Consumer<String> consumer = x-> System.out.println(" Рублей");
        consumer.accept("600");

       // Supplier<String> supplier = x -> ;

    }
}

class Box {
    void print(){
        System.out.println("You work? : Yes");;
    }

    static void printStatic() {
        System.out.println("You work ? : Yes");
    }
}
