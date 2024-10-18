package DSA_JAVA_Concepts.Linear_DS.Array;

public class Permutation {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
            //int[] arr = new int[0];
            System.out.print(ans[i] + " ");
        }
    }
}
