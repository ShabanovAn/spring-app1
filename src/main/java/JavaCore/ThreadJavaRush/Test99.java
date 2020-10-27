package JavaCore.ThreadJavaRush;

import java.util.HashSet;
import java.util.Set;

public class Test99 {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("three");
        for (String s : stringSet) {
            System.out.println(s);

        }
    }
}
