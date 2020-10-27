package JavaCore.LambdaTest;

public class LambdaApp1 {
    public static void main(String[] args) {
        Opera opera =new Opera() {
            @Override
            public int calc(int x, int y) {
                return x*y;
            }
        };
        int z = opera.calc(5, 3);
        System.out.println(z);

        Opera opera1 = (int x, int y) -> x - y;
        Opera opera2 = (int x, int y) -> x * y;
        Opera opera3 = (int x, int y) -> x / y;

        int r = opera1.calc(10,3);
        System.out.println(r);

    }
}
interface Opera {
    int calc(int x, int y);
}
