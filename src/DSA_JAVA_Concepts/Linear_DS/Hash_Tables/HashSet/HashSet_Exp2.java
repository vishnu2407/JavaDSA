package DSA_JAVA_Concepts.Linear_DS.Hash_Tables.HashSet;

import java.util.*;

public class HashSet_Exp2 {
    //Union of 2arrays using HashSet
    public static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
            for(int j=0; j<arr2.length; j++){
                set.add(arr2[j]);
            }
            //return set.size();
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        System.out.println("Union of 2 arrays: " + union(arr1, arr2));

    }
}
