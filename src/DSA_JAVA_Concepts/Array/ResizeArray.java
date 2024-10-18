package DSA_JAVA_Concepts.Array;

import java.util.Arrays;

public class ResizeArray {

    public static void main(String[] args) {
        int[] arr ={0, 2, 30, 32};
        int[] capacity = new int[arr.length * 2];
        arr = resize(arr, capacity);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] resize(int[] arr, int[] capacity) {
        int[] temp = new int[capacity.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
}
