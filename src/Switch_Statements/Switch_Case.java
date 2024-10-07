package Switch_Statements;

// Java program to demonstrate switch-case statement
// Switch-case statement is used to execute different code blocks based on the value of a variable.
// In this program, we have used a switch-case statement to perform arithmetic operations on two integers.
// The switch-case statement is used to check the value of the character A and execute the corresponding code block.
// The code block is executed only if the value of A matches the case label.
// If the value of A does not match any of the case labels, the default block is executed.
public class Switch_Case {
    public static void main(String[] args) {
        char A = 'A';    // Character A
        char S = 'S';    // Character S
        char M = 'M';    // Character M
        char D = 'D';    // Character D
        int X = 4;      // Integer X
        int Y = 64;     // Integer Y

            switch (A) {
                case 'A':
                    System.out.println("Addition of " + X + " and " + Y + " is " + (X + Y));
                    break;
            }
            switch (S) {
                case 'S':
                    System.out.println("Subtraction of " + X + " and " + Y + " is " + (X - Y));
                    break;
            }
            switch (M) {
                case 'M':
                    System.out.println("Multiplication of " + X + " and " + Y + " is " + (X * Y));
                    break;
            }
            switch (D) {
                case 'D':
                    System.out.println("Division of " + X + " and " + Y + " is " + (X / Y));
                    break;
            }
}
}

