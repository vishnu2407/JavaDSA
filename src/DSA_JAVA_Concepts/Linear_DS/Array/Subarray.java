package DSA_JAVA_Concepts.Linear_DS.Array;

import java.util.ArrayList;

public class Subarray {
    static ArrayList<Integer> subarray(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0, right = 0, sum = 0;
        while (right < arr.length) {
            sum += arr[right];
            while (sum >= target) {
                if (sum == target) {
                    result.add(left);
                    result.add(right);
                    return result;
                }
                sum -= arr[left];
                left++;
            }
            right++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 12;
        ArrayList<Integer> result = subarray(arr, target);
        System.out.println(result);
    }
}
