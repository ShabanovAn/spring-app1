package JavaCore.MyStream.old;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class MyList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list2.add("1");
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");

     //  Stream.of(list).forEach(System.out::println); // [1, 2, 3, 4, 5] - элемент потока список строк

       list.stream()  // элемент потока строка
               .peek(x -> System.out.println(x.getClass())) //выводит промежуточный результат но не меняем элемент потока
               .map(Integer::valueOf)
               .peek(x -> System.out.println(x.getClass()))
               .forEach(System.out::println);


//        Stream<List<String>> listStream = Stream.of(list, list2);
//        listStream
//                .flatMap(Collection::stream)
//                .forEach(System.out::println);

    }
}
