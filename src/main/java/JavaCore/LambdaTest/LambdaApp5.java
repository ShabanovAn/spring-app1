package JavaCore.LambdaTest;

public class LambdaApp5 {
    public static void main(String[] args) {
        Exceptoin exceptoin =(n) -> n%2 == 0;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 40 };
        System.out.println(sum(nums, exceptoin));

    }

    private static int sum(int[] numbers, Exceptoin exceptoin) {
        int result = 0;
        for (int i : numbers) {
            if(exceptoin.isEqual(i))
                 result+=1;
        }
        return result;
    }
}

interface Exceptoin {
    boolean isEqual(int n);
}
