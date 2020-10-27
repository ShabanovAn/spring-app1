package JavaCore.Arrays;

public class Chess {
    public static void main(String[] args) {
        for (int s = 0;  s < 4; s++) {
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    System.out.print("x");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}
