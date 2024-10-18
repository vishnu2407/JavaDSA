package DSA_JAVA_Concepts.Array;

import java.util.Arrays;

public class Find_Zero_Value {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");
        int[] arr = {0, -2, 30, -32, 40, -100, 20, -101};
        int var = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == var) {
                System.out.println("True");
                break;
            }
            else if (i == arr.length - 1) {
                System.out.println("False");
            }
        }
        System.out.println("args = " + Arrays.toString(arr));
    }
}
