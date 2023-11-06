import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Sum of natural numbers from 1 to " + N + " is: " + sum);
    }
}

