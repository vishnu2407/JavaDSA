package DSA_JAVA_Concepts.Linear_DS.Array;

public class reverse {
    public static void reverse(int[] num, int start, int end) {
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 0;
        int end = num.length - 1;
        reverse(num, start, end);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }


    }
}
