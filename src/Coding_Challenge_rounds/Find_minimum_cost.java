package Coding_Challenge_rounds;

public class Find_minimum_cost {
    // Function to find minimum cost to paint all the houses
    public static int findMinimumCost(int[] arr, int n) {
        int[] dp = new int[n];
        dp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[i-1] + arr[i], arr[i]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2};
        int n = arr.length;
        int minCost = findMinimumCost(arr, n);
        System.out.println("Minimum cost to paint all houses is: " + minCost);
    }
}