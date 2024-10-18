package Basic_Java_Concepts.Loops.While_Loop;

public class reverseNumb {
    public static void main(String[] args) {
        int n = 123456;
        int ans = 0;

        while (n > 0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }
        System.out.println(ans);

//        for (int i = n; i > 0; i /= 10) {
//            System.out.print(i % 10 + " ");
//        }
    }
}
