package DSA_JAVA_Concepts.Linear_DS.Hash_Tables.HashSet;

import java.util.*;

public class HashSet_Exp3 {
    //Intersection of 2 arrays
    public static int intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
            for(int j=0; j<arr2.length; j++){
                if(set.contains(arr2[j]))
                {
                    count++;
                    set.remove(arr2[j]);
                    break;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        //Count of intersection
        int count = intersection(arr1, arr2);
        System.out.println("Count of intersection: " + count);
    }
}
