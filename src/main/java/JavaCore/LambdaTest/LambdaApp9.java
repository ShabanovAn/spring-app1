package JavaCore.LambdaTest;

interface Oper {
    int execute(int x, int y);
}

public class LambdaApp9 {
    public static void main(String[] args) {
        Oper func = action(1);
        int a = func.execute(6, 5);
        System.out.println(a);

        int b = action(2).execute(8, 2);
        System.out.println(b);

    }

    private static Oper action(int number) {
        switch (number) {
            case 1 : return (x, y) -> x+y;
            case 2 : return (x, y) -> x-y;
            case 3 : return (x, y) ->x*y;
            default: return (x, y) -> 0;
        }
    }

}
