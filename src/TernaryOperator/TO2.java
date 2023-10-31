package TernaryOperator;

import java.util.Scanner;
public class TO2 {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        int num = 10;
        int first = 0, second = 1;
        System.out.println(first + " " + second);

//        for (int i = 2; i <= num; i++) {
//            int next = (i % 2 == 0) ? first + second: first - second;
//            System.out.println(next);
//            first = second;
//            second = next;
//        }
        while (num <= 10) {
            int next = (num % 2 == 0) ? first + second: first - second;
            System.out.println(next);
            first = second;
            second = next;
            num++;
        }


    }
}
