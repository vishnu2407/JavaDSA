package ArrayPackages;

public class SubArraySubtract {

    public static void main(String[] args) {

        // Your code for the main method goes here, if needed
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArraySubtract(nums);
        System.out.println("Maximum subarray subtract: " + result);
    }
    public static int maxSubArraySubtract(int[] nums) {

        int max_current = nums[0];
        int max_global = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max_current = Math.max(max_current - nums[i], nums[i]);
            max_global = Math.max(max_current, max_global);
        }
        return max_global;
    }
}
