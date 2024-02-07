package Array;

public class two_Sum
{
    public static void main(String[] args)
    {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] ans = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        System.out.println(ans[0] + " " + ans[1]);
    }
}
