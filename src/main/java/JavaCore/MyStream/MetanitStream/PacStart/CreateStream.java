package JavaCore.MyStream.MetanitStream.PacStart;

import java.util.ArrayList;
import java.util.Collections;

public class CreateStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Париж", "Лондон", "Мадрид");
        list.stream()
                .filter(s -> s.length()==6)
                .forEach(System.out::println);
    }
}
