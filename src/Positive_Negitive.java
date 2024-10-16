import java.util.Scanner;
public class Positive_Negitive {
    public static void main(String[] args) {
        //Write a program to give a number if it’s positive will print this is positive  or else it’s not positive will print negative ?
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println("This is positive");
        } else {
            System.out.println("This is negative");
        }

    }
}
