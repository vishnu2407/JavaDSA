package DSA_JAVA_Concepts.SortedList;

import java.util.Arrays;

public class SortList {

    public static int[] sortList(int[] listToSort) {
        // Create a copy of the array to avoid modifying the original
        int[] sortedList = Arrays.copyOf(listToSort, listToSort.length);
        int n = sortedList.length;
        // Iterate through the array n-1 times
        for (int i = 1; i < n; i++) {
            int key = sortedList[i];
            int j = i - 1;
            // Compare and shift elements to the right until the correct position is found
            while (j >= 0 && key < sortedList[j]) {
                sortedList[j + 1] = sortedList[j];
                j--;
            }
            // Insert the key at its correct position
            sortedList[j + 1] = key;
        }
        return sortedList;
    }

    public static void main(String[] args) {

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        int[] myList = {1, 9, 5, 2, 1, 8, 6, 6, 3, 4, 10, 7};
        int[] sortedList = sortList(myList);
        System.out.println(Arrays.toString(sortedList)); // Output: [1, 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10]
    }
}