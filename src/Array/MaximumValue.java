package Array;

import java.util.Arrays;

//import static jdk.nashorn.internal.objects.Global.print;

public class MaximumValue {

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");
        int[] arr = {0, -2, 30, -32, 40, -100, 20, -101, 0};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("args = " + Arrays.toString(arr));
        System.out.println("Maximum value in the array is: " + max);
    }
}
