package JavaCore.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
//        int[] number = {1,2,3,4,5,6,7,8,9};
//        System.out.println(number[0]);
//        number[0]=100;
//        System.out.println(number[0]);
//        for(int i=0; i < number.length; i++) {
//            System.out.println(number[i]);
//        }
//        for (int i : number) {
//            System.out.println(i);
//        }
//        String[] name = {"Name1", "Name2", "Name3", "Name4"};
//        for (String s : name) {
//            System.out.println(s);
//        }

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int[] myNumber : myNumbers) {
            //System.out.println(myNumber);
            for (int i : myNumber) {
                System.out.println(i);
            }
        }

        myNumbers[1][2] = 100;
        System.out.println(myNumbers[1][2]);

    }

}



