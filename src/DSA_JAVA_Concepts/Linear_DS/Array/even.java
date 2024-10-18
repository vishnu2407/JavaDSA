package DSA_JAVA_Concepts.Linear_DS.Array;

public class even {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                System.out.print(arr[i] + " ");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {

                System.out.print(arr[i] + " ");
            }
        }
    }
}
