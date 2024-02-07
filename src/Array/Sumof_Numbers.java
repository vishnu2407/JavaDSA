package Array;

public class Sumof_Numbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int i;
        for (i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        System.out.println("Sum of all elements of an array: " + arr[i - 1]);
    }
}
