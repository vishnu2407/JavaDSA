package DSA_JAVA_Concepts.Array;

import java.util.Arrays;

public class MinimumValue {

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");
        int[] arr = {0, -2, 30, -32, 40, -100, 20, -101};
        int min = arr[0];
        int Secondmin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            else if (arr[i] < Secondmin && arr[i] != min) {
                Secondmin = arr[i];
            }
        }
        System.out.println("args = " + Arrays.toString(arr));
        System.out.println("First Minimum value in the array is: " + min);
        System.out.println("Second Minimum value in the array is: " + Secondmin);
    }
}
