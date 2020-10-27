package JavaCore.LambdaTest;

interface Exp {
    boolean isIquels(int n);
}

class ExpHelper {

    boolean isIven(int n) {
        return n%2==0;
    }
}

public class Lambda7 {
    public static void main(String[] args) {
        int[] num = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        ExpHelper expHelper = new ExpHelper();
        System.out.println(sum(num, expHelper::isIven));
    }

    private static int sum(int[] num, Exp exp) {
        int result = 0;
        for (int i : num) {
            if (exp.isIquels(i))
                result += 1;
        }
        return result;
    }


}
