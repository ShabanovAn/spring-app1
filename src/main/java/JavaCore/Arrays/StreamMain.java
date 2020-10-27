package JavaCore.Arrays;

import java.util.stream.IntStream;

public class StreamMain {
    public static void main(String[] args) {
        int[] number = {1, -2, 3, -4, 5, -6, 7};
        int count = 0;
        for (int i : number) {
            if (i > 0) {
                System.out.println(count++);
            }
        }
        System.out.println(count);

        long count1 = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
                .filter(w -> w > 0)
                .count();
        System.out.println(count1);
    }
}
