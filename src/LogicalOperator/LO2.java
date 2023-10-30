package LogicalOperator;
import java.util.Scanner;
public class LO2 {
    public static void main(String[] args) {
        // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
        // then press Enter. You can now see whitespace characters in your code.
        Scanner sc = new Scanner(System.in);

        //Using Logical OR  Operator
        String User = "Google";

        if(User =="Google" || User =="Microsoft" || User =="Apple"){
            System.out.println("User belongs to Google or Microsoft");
        }else{
            System.out.println("Block the User");
        }
    }
}
