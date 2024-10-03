package Hash_Tables.HashMap;
import java.util.*;
public class HashMapExp1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Mango");

        System.out.println(map);

         //Accessing values using keys
        System.out.println(map.get(2)); // Output: Banana

        int arr[] = {1, 2, 3, 4};
        for(int i=0; i<4; i++) {
            System.out.println(arr[i] + " ");
        }
        for(int value: arr){
            System.out.println(value + " ");
        }

        Set<Integer> keys = map.keySet();
        for(Integer key: keys){
            System.out.println(key + " " + map.get(key));
        }

    }
}
