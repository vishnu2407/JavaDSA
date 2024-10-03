package Hash_Tables.HashSet;

import java.util.*;

public class HashSet_Exp1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set); // [1, 2, 3, 4]

        if(set.contains(2)) {
            System.out.println("2 is present in the set");
        }
        if(!set.contains(5)) {
            System.out.println("5 is not present in the set");
        }

        while(!set.isEmpty()) {
            System.out.println(set.remove(set.iterator().next()));
        }
    }
}
