package Conditions;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Upper Case");
        }
        else {
            System.out.println("Invalid Case");
        }

//        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//            System.out.println("vowel");
//        }
//        else {
//            System.out.println("consonant");
//        }

    }
}
