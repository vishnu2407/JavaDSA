package Array;

import java.util.Arrays;

public class SecondMaxValue {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");
        int[] arr = {0, -2, 30, -32, 40, -100, 20, -101};
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("args = " + Arrays.toString(arr));
        System.out.println("First Maximum value in the array is: " + max);
        System.out.println("Second Maximum value in the array is: " + secondMax);

    }
}
