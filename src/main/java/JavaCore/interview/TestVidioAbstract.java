package JavaCore.interview;

public class TestVidioAbstract {
    public static void main(String[] args) {
        int[] numbers = {64,-99, 55, -33, 1, 2, 3, 4, 88, 43, 65, 32};
        int maxValue = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > maxValue) {
                maxValue = numbers[i];
                index = i;
            }
        }
        System.out.println(maxValue + " " +  index);
    }
}
