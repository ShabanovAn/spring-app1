package JavaCore.Arrays;

import java.util.ArrayDeque;

public class DQ {
    public static void main(String[] args) {


        ArrayDeque<Hors> strings = new ArrayDeque<>();
        strings.add(new Hors("Hors1", 22));

        strings.addFirst(new Hors("hors2", 302));

        strings.push(new Hors("hors3", 66));

        for (Hors string : strings) {
            System.out.println(string);

        }

    }
}
