package DSA_JAVA_Concepts.Linear_DS.Array;

public class Single_Number {
    //To find the single number in an array
    public static int singleNumber(int nums[]) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int result = 0;
        for (int num: nums) {
            result = result ^ num;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr1[] = {1,1, 2, 2, 2};
        int arr2[] = {8, 8, 7, 7, 6, 6, 1};

        System.out.println(singleNumber(arr1));
        System.out.println(singleNumber(arr2));
    }
}
