package JavaCore.LambdaTest;

interface Expresion {
    boolean isEquel(int n);
}

class ExpressionHelper {
    static boolean isEven(int n) {
        return n%2==0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }

}

public class LamdaApp6 {
    public static void main(String[] args) {

        int[] nums = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println(sum(nums, ExpressionHelper::isEven));


        Expresion e = ExpressionHelper::isPositive;
        System.out.println(sum(nums, e));

    }

    private static int sum(int[] num, Expresion ex) {
        int result =0;
        for (int i : num) {
            if(ex.isEquel(i))
                result  += 1;
        }
        return result;
    }
}


