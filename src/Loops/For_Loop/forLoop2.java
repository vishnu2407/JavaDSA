package Loops.For_Loop;

import java.util.Scanner;

public class forLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int num = 0; num <= n ; num += 2) {
            System.out.print(num + " ");
        }
    }
}