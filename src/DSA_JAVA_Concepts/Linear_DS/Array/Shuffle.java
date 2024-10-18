package DSA_JAVA_Concepts.Linear_DS.Array;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ans = new int[arr.length];

        System.arraycopy(arr, 0, ans, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            ans[i] = arr[index];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}