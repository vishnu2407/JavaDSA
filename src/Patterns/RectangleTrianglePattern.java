package Patterns;

public class RectangleTrianglePattern {
    // Function to print the pattern
    public static void printPattern(int n) {
        int rows = 2 * n - 1;
        int cols = 2 * n - 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
}