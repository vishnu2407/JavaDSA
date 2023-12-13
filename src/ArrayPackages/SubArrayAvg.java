package ArrayPackages;

public class SubArrayAvg {

    public static void main(String[] args) {

        // Your code for the main method goes here, if needed
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        double avg = calculateAverage(nums);
        System.out.println("Average: " + avg);
    }
    public static double calculateAverage(int[] nums) {
        if (nums.length==0){
            return 0.0;
        }
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        return (double)sum / nums.length;
    }
}



