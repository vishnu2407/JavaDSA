package Design_Patterns;

public class RightAngleTrianglePattern {
    // Function to print pattern
    //Printing a right angle triangle of * with n rows
    // * will be printed in each row from 1 to i and spaces will be printed in each row from i to 1
    // We will print n rows and then move to next line


    public static void printRightAngleTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6;
        printRightAngleTriangle(n);
    }
}
