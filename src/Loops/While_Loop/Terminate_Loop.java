package Loops.While_Loop;

import java.util.Scanner;

public class Terminate_Loop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Infinite loop that we will break out of when the user enters '0'
        while (true) {
            System.out.print("Enter a number (Enter 0 to terminate the loop): ");
            int number = scanner.nextInt();

            // If the user enters 0, the loop will terminate
            if (number == 0) {
                System.out.println("Terminating the loop...");
                break; // Exit the loop
            }

            // Print the entered number
            System.out.println("You entered: " + number);
        }
        // Close the scanner
        scanner.close();
        System.out.println("Loop has been terminated.");
    }
}
