package ArrayPackages;

public class  ArrayMissing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int sum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = n; i <= n; i++) {
            actualSum -= arr[i - 1];
        }
        int missingNumber = sum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}