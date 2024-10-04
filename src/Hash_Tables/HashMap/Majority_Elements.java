package Hash_Tables.HashMap;

import java.util.*;

public class Majority_Elements {
    public static void majorityElement(int nums[]){ //true

        // Step 1: Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>(); // <key, value>
        int n = nums.length;

        // Step 2: Traverse the array and update the frequency of each element in the HashMap
        for(int i=0; i<n; i++){ //true
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else { //false
                map.put(nums[i], 1);
            }
        }

        // Step 3: Traverse the HashMap and print the element(s) with frequency greater than n/3
        for(int key : map.keySet()){ //true
            if(map.get(key) > n/3){
                System.out.println(key + " " + map.get(key));
        }

    }
    }
    public static void main(String args[])
    {
        int nums1[] = {1,3,2,5,1,3,1,5,1};
        int nums2[] ={1,2};

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        System.out.println("Majority elements of array 1:" + Arrays.toString(nums1));
        System.out.println("------------------------------------------------");

        System.out.println("Majority elements of array 2:" + Arrays.toString(nums2));
        System.out.println("----------------------------------------------");

        // Function call to find the majority element
        System.out.println("Majority elements of array 1 and 2:");
        majorityElement(nums1);
        majorityElement(nums2);
    }
}
