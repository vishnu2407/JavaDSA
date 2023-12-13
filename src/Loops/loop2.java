package Loops;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int MaxValue = Integer.MIN_VALUE;
        for (int i = 0; i <= num; i++) {
            int current = sc.nextInt();
            MaxValue = Math.max(MaxValue, current);
            System.out.println(MaxValue);
        }
    }
}