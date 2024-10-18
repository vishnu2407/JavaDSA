package Basic_Java_Concepts.Conditions;

import java.util.Scanner;

public class maxValue {
    public static void main(String[] args) {
        // Your code for the main method goes here, if needed
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
