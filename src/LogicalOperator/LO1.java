package LogicalOperator;

//import java.util.Scanner;

public class LO1 {
    public static void main(String[] args) {
        // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
        // then press Enter. You can now see whitespace characters in your code.
        //Scanner sc = new Scanner(System.in);

        //Using Logical Add Operator
        int age = 25;
        String country = "India";

        if(age >= 18 && country.equals("India")){
            System.out.println("Person is Eligibe Vote");
        }else{
            System.out.println("Person is Not Eligible Vote");
        }

    }
}
