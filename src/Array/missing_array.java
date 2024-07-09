package Array;

public class missing_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 9, 10, 8};
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        System.out.println(sum);
    }
}
