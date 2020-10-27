package JavaCore.MyStream.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MetanitCollect {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        List<String> filtersPhones = phones.stream().filter(s -> s.length() < 10).collect(Collectors.toList());
        for (String filtersPhone : filtersPhones) {
            System.out.println(filtersPhone);
        }

//        Set<String> filteredPhones = phones.stream()
//                .filter(s->s.length()<10)
//                .collect(Collectors.toSet());

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 8", 54000),
                new Phone("Nokia 9", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("LG G6", 32000));

        Map<String, Integer> phonesMap = phoneStream
                .collect(Collectors.toMap(p -> p.getName(), t -> t.getPrice()));
        phonesMap.forEach((k, v) -> System.out.println(k + " " + v));


        Stream<String> mobPhone = Stream.of("iPhone 8", "Nokia 9", "Samsung Galaxy S9", "LG G6");

        HashSet<String> mobFilter = mobPhone.filter(s -> s.length() < 12).
                collect(Collectors.toCollection(HashSet::new));
        mobFilter.forEach(s -> System.out.println(s));


        Stream<String> phonesColl = Stream.of("iPhone 8", "Nokia 9", "Samsung Galaxy S9", "LG G6");

        ArrayList<String> filtrPhones = phonesColl.filter(s->s.length() < 12)
                .collect(
                        ()->new ArrayList<String>() // создаем ArrayList
                        ,(list, item) ->list.add(item), // добавляем в список элемент
                        (list1, list2)->list1.addAll(list2)); // добавляем в список другой список
        filtrPhones.forEach(s->System.out.println(s));

    }
}
