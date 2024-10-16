package Loops.For_Loop;

import java.util.Scanner;

public class Sumof_Natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        double sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}
