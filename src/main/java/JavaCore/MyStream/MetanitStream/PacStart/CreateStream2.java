package JavaCore.MyStream.MetanitStream.PacStart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class CreateStream2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Париж", "Лондон", "Мадрид");
        Stream<String> stringStream = list.stream();
        stringStream = stringStream.filter(s->s.length()==6);
        stringStream.forEach(System.out::println);
    }
}
