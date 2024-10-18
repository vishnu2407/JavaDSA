package DSA_JAVA_Concepts.SortedList;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        String[] myList = {"Geya", "Vishnu", "Vamshi","Subhash", "Vikas", "Vivek", "Chari", "Vijay"};
        String[] sortedList = sortList(myList);
        System.out.println(Arrays.toString(sortedList));
    }
    public static String[] sortList(String[] listToSort) {
        // Create a copy of the array to avoid modifying the original
        String[] sortedList = Arrays.copyOf(listToSort, listToSort.length);
        int n = sortedList.length;
        // Iterate through the array n-1 times
        for (int i = 1; i < n; i++) {
            String key = sortedList[i];
            int j = i - 1;
            // Compare and shift elements to the right until the correct position is found
            while (j >= 0 && key.compareTo(sortedList[j]) < 0) {
                sortedList[j + 1] = sortedList[j];
                j--;
            }
            // Insert the key at its correct position
            sortedList[j + 1] = key;
        }
        return sortedList;
    }
}
