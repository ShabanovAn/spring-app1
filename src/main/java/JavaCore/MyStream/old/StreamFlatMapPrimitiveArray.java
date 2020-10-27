package JavaCore.MyStream.old;

import java.util.Arrays;

public class StreamFlatMapPrimitiveArray {
    public static void main(String[] args) {

        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        int[] newArray = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .toArray();

        System.out.println(Arrays.toString(newArray));


//
//        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
//         int[] newArray = Arrays.stream(arr)
//                 .flatMapToInt(i -> Arrays.stream(i))
//                 .toArray();
//        System.out.println(Arrays.toString(newArray));


//        int[] [] arr = {{1,2}, {3,4}, {5,6}};
//        int[] newArray = new int[arr.length * arr[0].length];
//        for (int i = 0, index =0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length ; j++) {
//                newArray[index++] = arr[i][j];
//            }
//        }
//        System.out.println(Arrays.toString(newArray));
    }
}
