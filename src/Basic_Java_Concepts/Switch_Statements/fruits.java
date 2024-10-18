package Basic_Java_Concepts.Switch_Statements;

import java.util.Scanner;

public class fruits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "Apple":
                System.out.println("A Sweet red fruit");
                break;
            case "Banana":
                System.out.println("The fruit of the jungle");
                break;
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Orange":
                System.out.println("round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Not a fruit");
                break;
        }
    }
}
