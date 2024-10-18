package Basic_Java_Concepts.Switch_Statements;

import java.util.Scanner;

public class nested_Switch_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.next();

        switch (empId) {
            case 1001:
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Accounts":
                        System.out.println("Accounts Department");
                        break;
                    case "HR":
                        System.out.println("HR Department");
                        break;
                    default:
                        System.out.println("Invalid Department");
                        break;

                }
            case 1002:
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Accounts":
                        System.out.println("Accounts Department");
                        break;
                    case "HR":
                        System.out.println("HR Department");
                        break;
                    default:
                        System.out.println("Invalid Department");
                        break;
                }
        }
    }
}