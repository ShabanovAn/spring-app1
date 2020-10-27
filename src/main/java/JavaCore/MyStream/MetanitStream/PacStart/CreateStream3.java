package JavaCore.MyStream.MetanitStream.PacStart;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStream3 {
    public static void main(String[] args) {
        Stream<String> stream = Arrays.stream(new String[]{"Париж", "Лондон", "Мадрид"});
        stream.forEach(System.out::println);

        IntStream intStream = Arrays.stream(new int[]{1,2,3,4,5,6,7});
        intStream.forEach(System.out::println);

        LongStream longStream = Arrays.stream(new long[]{100,250,400,5843787,237});
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = Arrays.stream(new double[]{3.4, 6.7, 9.5, 8.2345, 121});
        doubleStream.forEach(System.out::println);

        Stream<String> stringStream = Stream.of("Париж", "Лондон", "Мадрид");
        stringStream.forEach(System.out::println);

        String[] cities = {"Париж", "Лондон", "Мадрид"};
        Stream<String> stream1 = Stream.of(cities);
        stream1.forEach(System.out::println);

        IntStream intStream1 = IntStream.of(1,2,4,5,7);
        intStream1.forEach(System.out::println);

        LongStream longStream1 = LongStream.of(100,250,400,5843787,237);
        longStream1.forEach(System.out::println);

        DoubleStream doubleStream1 = DoubleStream.of(3.4, 6.7, 9.5, 8.2345, 121);
        doubleStream1.forEach(System.out::println);



    }
}
