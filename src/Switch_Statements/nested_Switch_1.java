package Switch_Statements;

import java.util.Scanner;

public class nested_Switch_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Week = sc.next();
        String Month = sc.next();
        int Year = sc.nextInt();

        if (Week.equals("Monday")) {
            switch (Month) {
                case "January":
                    System.out.println("1st January " + Year);
                    break;
                case "February":
                    System.out.println("1st February " + Year);
                    break;
                case "March":
                    System.out.println("1st March " + Year);
                    break;
                case "April":
                    System.out.println("1st April " + Year);
                    break;
                case "May":
                    System.out.println("1st May " + Year);
                    break;
                case "June":
                    System.out.println("1st June " + Year);
                    break;
                case "July":
                    System.out.println("1st July " + Year);
                    break;
                case "August":
                    System.out.println("1st August " + Year);
                    break;
                case "September":
                    System.out.println("1st September " + Year);
                    break;
                case "October":
                    System.out.println("1st October " + Year);
                    break;
                case "November":
                    System.out.println("1st November " + Year);
                    break;
                case "December":
                    System.out.println("1st December " + Year);
                    break;
            }
        } else if (Week.equals("Tuesday")) {
            switch (Month) {
                case "January":
                    System.out.println("2nd January " + Year);
                    break;
                case "February":
                    System.out.println("2nd February " + Year);
                    break;
                case "March":
                    System.out.println("2nd March " + Year);
                    break;
                case "April":
                    System.out.println("2nd April " + Year);
                    break;
                case "May":
                    System.out.println("2nd May " + Year);
                    break;
                case "June":
                    System.out.println("2nd June " + Year);
                    break;
                case "July":
                    System.out.println("2nd July " + Year);
                    break;
                case "August":
                    System.out.println("2nd August " + Year);
                    break;
                case "September":
                    System.out.println("2nd September " + Year);
                    break;
                case "October":
                    System.out.println("2nd October " + Year);
                    break;
                case "November":
                    System.out.println("2nd November " + Year);
                    break;
                case "December":
                    System.out.println("2nd December " + Year);
                    break;
            }
        } else {
            if (Week.equals("Wednesday") || Week.equals("Thursday") || Week.equals("Friday") || Week.equals("Saturday") || Week.equals("Sunday")) {
                System.out.println("Invalid Input" +" "+ Week);
                System.out.println("Invalid Input" +" " + Month);
                System.out.println("Invalid Input" +" " + Year);
            }
        }
    }
}
