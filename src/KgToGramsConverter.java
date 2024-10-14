import java.util.Scanner;

public class KgToGramsConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the kilogram value
        System.out.print("Enter weight in kilograms: ");
        double kg = scanner.nextDouble();

        // Conversion: 1 kilogram = 1000 grams
        double grams = kg * 1000;

        // Display the result
        System.out.println(kg + " kg is equal to " + grams + " grams.");

        // Close the scanner
        scanner.close();
    }
}
