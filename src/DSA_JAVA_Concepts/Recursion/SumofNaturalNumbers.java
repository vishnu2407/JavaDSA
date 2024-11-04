package DSA_JAVA_Concepts.Recursion;
import java.util.Scanner;
public class SumofNaturalNumbers {

    //Recursive function to find the sum of first n natural numbers
    //sum(n) = n + sum(n-1)/2
    //Parameters : i - current number being added to the sum
    //             n - total number of natural numbers
    //             sum - current sum of natural numbers
//    public static int printsum(int i, int n, int sum){
//        if(i==n){
//            sum+=i;
//            return sum;
//        }
//        sum+=i;
//        return printsum(i+1,n,sum);
//        //System.out.println(i);
//
//    }
    //Recursive function to find the sum of first n natural numbers
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        //Calling the recursive function to find the sum of first 5 natural numbers
       //printsum(1, 5, 0);
//        System.out.println("The sum of first n natural numbers is: "+printsum(1, 6, 0));


       int n =5;
        int sum = sum(n);
        System.out.println("The sum of first "+n+" natural numbers is: "+sum);
        //Using recursion to find the sum of first n natural numbers

        //Using for loop to find the sum of first n natural numbers
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value of n: ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for(int i=1; i<=n; i++){
//            sum+=i;
//        }
//        System.out.println("The sum of first "+n+" natural numbers is: "+sum);
    }
}
