package SwitchCase;

import java.util.Scanner;

public class SC2 {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        //ch = Character.toUpperCase(ch);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
        }



}
