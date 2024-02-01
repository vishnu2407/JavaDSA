package Conditions;

import java.util.Scanner;

public class calculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;

        while (true){
            System.out.print("Enter an operator: ");
            char ch = sc.next().trim().charAt(0);
            System.out.print("Enter two numbers: ");
            if (ch == '+' || ch =='-' || ch == '*' || ch =='/' || ch == '%'){
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(ch == '+'){
                    ans = num1 + num2;
                }
                else if(ch == '-'){
                    ans = num1 - num2;
                } else if (ch == '*') {
                    ans = num1 * num2;
                } else if (ch == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                } else if (ch == '%') {
                    ans = num1 % num2;
                }
            }
            else if (ch == 'X' || ch == 'x'){
                break;
            }
            else {
                System.out.println("Invalid Input");
            }
            System.out.println(ans);
        }
    }
}
