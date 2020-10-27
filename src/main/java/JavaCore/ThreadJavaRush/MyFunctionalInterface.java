package JavaCore.ThreadJavaRush;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MyFunctionalInterface {
    public static void main(String[] args) {
       // Supplier — поставщик. Он не имеет параметров, но возвращает что-то, то есть поставляет это.
        Supplier<String> supplier = () -> "String";
       // Consumer — потребитель. Он принимает на вход что-то (параметр s) и с этим что-то что-то делает, то есть потребляет что-то.
        Consumer<String> consumer = s -> System.out.println(s);
        Function<String, Integer> converter = s -> Integer.valueOf(s);
    }
}
