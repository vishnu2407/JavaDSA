package DSA_JAVA_Concepts.Linear_DS.SortedList;

public class MergeTwoList {

    public static void main(String[] args) {

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        int[] l1 = new int[]{1, 2, 3};
        int[] l2 = new int[]{4, 5, 6};

        // Create a new array to store the merged elements
        int[] merged = new int[l1.length + l2.length];

        // Copy elements from l1 to merged
        System.arraycopy(l1, 0, merged, 0, l1.length);

        // Copy elements from l2 to merged
        System.arraycopy(l2, 0, merged, l1.length, l2.length);

        // Print the merged array
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
