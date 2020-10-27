package JavaCore.MyStream.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        Optional<Integer> result = numbersStream.reduce((x, y) -> x * y);
        System.out.println(result.get());

        Stream<String> wordsStream1 = Stream.of("мама", "мыла", "раму");
        Optional<String> sentence1 = wordsStream1.reduce((x, y) -> x + " " + y);
        System.out.println(sentence1.get());

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        String sentence = wordsStream.reduce("Результат:", (x, y) -> x + " " + y);
        System.out.println(sentence);

//        Stream<Phone> phoneStream = Stream.of(
//                new Phone("iPhone 6 S", 54000),
//                new Phone("Lumia 950", 45000),
//                new Phone("Samsung Galaxy S 6", 40000),
//                new Phone("LG G 4", 32000));

//        int sum = phoneStream.reduce(0, (x, y) -> {
//            if (y.getPrice() < 50000)
//                return x + y.getPrice();
//            else
//                return x + 0;
//        }, (x, y) -> x + y);
//        System.out.println(sum);


    }
}
