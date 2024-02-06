package Functions;

import java.util.Scanner;

public class Largest_Smallest {
    public static int largest(int first, int second, int third){
        int max= first;
        if (second>max){
            max = second;
        }
        if (third>max){
            max = third;
        }
        return max;
    }
    public static int smallest(int first, int second, int third){
        int min= first;
        if (second<min){
            min = second;
        }
        if (third<min){
            min = third;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in Java program to find largest and smallest of three numbers");

        System.out.println("Enter the First number: ");
        int first = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int second = sc.nextInt();
        System.out.println("Enter the Third number: ");
        int third = sc.nextInt();

        System.out.println("Largest number is " + largest(first, second, third));
        System.out.println("Smallest number is " + smallest(first, second, third));
    }
}
