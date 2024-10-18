package DSA_JAVA_Concepts.Array;

import java.util.Arrays;

public class ArrayUtil {

    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - i - 1];
        }
        return reversed;
    }
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        return arr3;
    }

    public static int[] shuffle(int[] arr) {
        int[] shuffled = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            shuffled[i] = arr[index];
        }
        return shuffled;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 1, 3, 6, 7, 8, 9, 10};
        int[] reversed = reverse(arr);
        int[] concat = concat(arr, reversed);
        int[] shuffled = shuffle(arr);

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Reversed array: " + Arrays.toString(reversed));
        System.out.println("Concatenated array: " + Arrays.toString(concat));
        System.out.println("Shuffled array: " + Arrays.toString(shuffled));
    }
}
