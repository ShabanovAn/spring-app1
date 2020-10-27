package JavaCore.MyStream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Mixing {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList("Tom", "Sam", "Dob", "Alice"));
        System.out.println(arrayList.stream().count());

        System.out.println(arrayList.stream().filter(a -> a.length() <= 3).count());

        Optional<String> first = arrayList.stream().findFirst();
        System.out.println(first);

        Optional<String> any = arrayList.stream().findAny();
        System.out.println(any);

        // есть ли в потоке строка, длина которой больше 3
        boolean any1 = arrayList.stream().anyMatch(s ->s.length() == 3);
        System.out.println(any1);

        // все ли строки имеют длину в 3 символа
        boolean all = arrayList.stream().allMatch(s -> s.length() == 3);
        System.out.println(all);

        // НЕТ ЛИ в потоке строки "Bill". Если нет, то true, если есть, то false
        boolean none = arrayList.stream().noneMatch(s -> s.equals("Bill"));
        System.out.println(none);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);

        System.out.println(min);
        System.out.println(max);

//
//        ArrayList<Phone> phones = new ArrayList<>();
//        phones.addAll(Arrays.asList(new Phone("iPhone 8", 52000),
//                new Phone("Nokia 9", 35000),
//                new Phone("Samsung Galaxy S9", 48000),
//                new Phone("HTC U12", 36000)));

      //  Phone min1  = phones.stream().min(Phone::compare).get();
     //   Phone max1  = phones.stream().max(Phone::compare).get();
//
//        System.out.printf("Min name: %s Prise: %d \n", min1.getName(), min1.getPrice());
//        System.out.printf("Max name: %s Prise: %d \n", max1.getName(), max1.getPrice());
//


    }
}
