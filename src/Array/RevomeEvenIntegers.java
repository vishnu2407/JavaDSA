package Array;

import java.util.Arrays;

public class RevomeEvenIntegers {
//    public static void print(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] res = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                res[idx] = arr[i];
                idx++;
            }
        }
        //print(res);
        return res;
    }

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        //print(arr);
        removeEven(arr);
    }
}
