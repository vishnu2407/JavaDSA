package Basic_Java_Concepts.Conditions;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values A and B
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate the LCM
        int lcm = calculateLCM(A, B);

        // Print the LCM
        System.out.println(lcm);
    }

    // Function to calculate LCM using GCD (Greatest Common Divisor)
    private static int calculateLCM(int a, int b) {
        // Calculate GCD using Euclidean algorithm
        int gcd = calculateGCD(a, b);

        // LCM is calculated using the formula: LCM(A, B) = (A * B) / GCD(A, B)
        return (a * b) / gcd;
    }

    // Function to calculate GCD
    private static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }
}
