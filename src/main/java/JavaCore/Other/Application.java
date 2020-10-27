package JavaCore.Other;

public class Application {
    public static void main(String[] args) {

        DitgitOperation ditgitOperation = (n) -> n%2==0;
        int[] mas = {1,2,3,4,5,6,7,8,9,10,11};

       // System.out.println(ditgitOperation.inIquels(4));
        System.out.println(sum(mas, ditgitOperation));

    }

    private static int sum (int numbers[], DitgitOperation ditgitOperation) {
        int resut = 0;
        for (int number : numbers) {
            if (ditgitOperation.inIquels(number))
                resut += 1;
        }
        return resut;
    }
}
