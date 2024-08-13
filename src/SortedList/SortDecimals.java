package SortedList;

import java.util.Arrays;

public class SortDecimals {

    public static void main(String[] args) {

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        float[] arr = {1.5f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f, -5.0f, -3.0f, -2.0f, 1.0f, 2.0f};
        float[] sortedList = sortList(arr);
        System.out.println(Arrays.toString(sortedList)); // Output: [-10, -5, -3, -2, -1, 0, 1, 2, 4, 6, 7, 8, 9]
    }
    public static float[] sortList(float[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}