package Conditions;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // Your code for the main method goes here
        int Celsius = (T - 32) * 5 / 9;
        int Fahrenheit = T * 9 / 5 + 32;

        if (Celsius < 0) {
            System.out.println("Below freezing temperature");
        }
        else if (Celsius > 100) {
            System.out.println("Above boiling temperature");
        }
        else {
            System.out.println("Normal temperature");
        }
        if (Fahrenheit < 32) {
            System.out.println("Below freezing temperature");
        }
        else if (Fahrenheit > 212) {
            System.out.println("Above boiling temperature");
        }
        else {
            System.out.println("Normal temperature");
        }
        System.out.println("Temperature in Celsius:" + Celsius);
        System.out.println("Temperature in Fahrenheit:"+ Fahrenheit);
        sc.close();
    }
}
