package TernaryOperator;

import java.util.Scanner;

public class TO1 {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String ans = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(ans);
    }
}
