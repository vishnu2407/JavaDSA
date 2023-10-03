package ArrayPackages;

public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int min = arr[4];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                System.out.println("Value at index "+ i + ": " + min);
            }

        }
    }
}
