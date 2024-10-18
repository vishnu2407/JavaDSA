package DSA_JAVA_Concepts.Hash_Tables.HashMap;

import java.util.*;

public class SubArray_Count_Exp4 {

    public static void main(String[] args) {
        int[] arr ={10, 2, -2, -20, 10};  //ans-->3
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();//<Sum, Frequency>

        map.put(0, 1);
        int ans =0;
        int sum = 0;

        for(int j=0; j<arr.length; j++){
            sum += arr[j];

            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }else{
                map.put(sum, 1);
            }
        }
        System.out.println(ans);

    }
}
