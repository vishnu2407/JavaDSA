package DSA_JAVA_Concepts.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Intersection {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};

        HashMap<Object, Object> map = new HashMap<>();

        // Count occurrences of each number in arr1
        for (int num : arr1) {
            Integer count = (Integer) map.get(num);
            if (count == null) {
                map.put(num, 1);
            } else {
                map.put(num, count + 1);
            }
        }

        // Find intersection with arr2 and update map
        List<Integer> intersection = new ArrayList<>();
        for (int num : arr2) {
            Integer count = (Integer) map.get(num);
            if (count != null && count > 0) {
                intersection.add(num);
                map.put(num, count - 1);
            }
        }

        // Print the intersection
        System.out.println("Intersection: " + intersection);
    }
}
