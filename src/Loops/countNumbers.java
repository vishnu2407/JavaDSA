package Loops;

public class countNumbers {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int n = 50000;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
