package Array;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 1, 3, 6, 7, 8};
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
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
