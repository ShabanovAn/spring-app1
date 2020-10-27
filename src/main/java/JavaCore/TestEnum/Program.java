package JavaCore.TestEnum;

import java.util.Scanner;

enum Fruits {
    APPLE,
    LEMON,
    MANDARIN

}

public class Program {
   // public static final int APPELSIN = 10;
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String fruit = scanner.nextLine();
//       // Fruits f = Fruits.valueOf(fruit);
//        for (Fruits fruit1 : Fruits.values()) {
//            if (fruit1.name().equals(fruit))
//                System.out.println(fruit);
//        }
        int sum = 0;
        Fruits f = Fruits.APPLE;
        switch (f) {
            case APPLE: sum += 10; break;
            case LEMON: sum += 15; break;
            case MANDARIN: sum += 20; break;
        }

    }
}
