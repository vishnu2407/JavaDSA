package DSA_JAVA_Concepts.Array;

import java.util.ArrayList;
import java.util.List;

public class target_Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        List<Integer> ans = new ArrayList<>();
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans.add(index[i], arr[i]);
        }
        int h=0;
        for (int a : ans) {
            res[h] = a;
            h++;
        }
        System.out.println(ans);
    }
}
