package ArrayPackages;

import java.util.Arrays;

public class ArrayClass3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] > index) {
            index = arr[i];
                System.out.println("Value at index "+ i + ": " + index);
            } else {
            if (arr[i] < index) {
                index = arr[i];
                System.out.println("IndexOutOfBoundsException: " + index);
            }
            }

        }
    }
}
