package Functions;

import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
        //writing the code for prime numbers in function
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Prime numbers between " + num1 + " and " + num2 + " are:");
        for (int i = num1; i <= num2; i++) {
            isPrime(i);
        }

    }

    private static void isPrime(int i) {
        int count = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.print(i + " ");
        }
    }
}
