package JavaCore.MyStream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class MetanitOptional {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList( 2, 3, 4, 5, 6, 7, 8, 9));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.get());

        // список numbers пустой
//        ArrayList<Integer> integers = new ArrayList<>();
//        Optional<Integer> min1 = integers.stream().min(Integer::compare);
//        System.out.println(min1.get()); // java.util.NoSuchElementException

        ArrayList<Integer> numbers1 = new ArrayList<>();
        Optional<Integer> min1 = numbers1.stream().min(Integer::compare);
        if (min1.isPresent()) {
            System.out.println(min1.get());
        }

        // пустой список
        ArrayList<Integer> integers = new ArrayList<>();
        Optional<Integer> min2 = integers.stream().min(Integer::compare);
        System.out.println(min2.orElse(-1)); //-1

        integers.addAll(Arrays.asList(4, 5, 6, 7, 8, 9));
        min2 = integers.stream().min(Integer::compare);
        System.out.println(min2.orElse(-1)); //4


        ArrayList<Integer> integers1 = new ArrayList<>();
        Optional<Integer> min3 = integers1.stream().min(Integer::compare);
        Random rnd = new Random();
        System.out.println(min3.orElseGet(() -> rnd.nextInt(100)));

        ArrayList<Integer> integers2 = new ArrayList<>();
        Optional<Integer> min4 = integers2.stream().min(Integer::compare);
        //System.out.println(min4.orElseThrow(IllegalStateException::new));


        ArrayList<Integer> integers3 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        Optional<Integer> min5 = integers3.stream().min(Integer::compare);
        min5.ifPresent(a -> System.out.println(a));


//        ArrayList<Integer> numbersOrElse = new ArrayList<>();
//        Optional<Integer> minVa = numbersOrElse.stream().min(Integer::compare);
//        minVa.ifPresentOrElse(
//                v -> System.out.println(v),
//                () -> System.out.println("Value not found")
//        );

    }
}
