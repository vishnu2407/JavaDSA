package Design_Patterns;

public class ReverseRightAngleTrianglePattern {
    // Function to print pattern
    // Printing Reverse Triangle Pattern
    public static void printReverseTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {
        int n = 6;
        printReverseTrianglePattern(n);
    }
}
