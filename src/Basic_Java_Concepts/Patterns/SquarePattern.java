package Basic_Java_Concepts.Patterns;

public class SquarePattern {
    // Function to print rectangle pattern
    public static void printSquarePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printSquarePattern(n);
    }
}
