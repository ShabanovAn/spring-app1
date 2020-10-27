package JavaCore.MyStream.stream.streamVidio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo {

    static class MyPredicate implements Predicate<Integer> {

        @Override
        public boolean test(Integer integer) {
            return integer % 2 != 0;
        }
    }

    static class MyConsumer<T> implements Consumer<T> {

        @Override
        public void accept(T item) {
            System.out.println("# " + item);
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        final int skip = 3;

        integerList.stream().filter(new MyPredicate()).forEach(new MyConsumer<>());
        integerList.stream().filter((val)->val != skip).forEach(System.out::println);

    }
}
