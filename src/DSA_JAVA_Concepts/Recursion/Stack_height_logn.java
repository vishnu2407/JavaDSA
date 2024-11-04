package DSA_JAVA_Concepts.Recursion;

public class Stack_height_logn {
    public static int power(int x, int n){
        if (n == 0) { //Base case 1
        return 1;
        }
        if (x == 0) { //Base case 2
        return 0;
        }
        //if n is even
        if(n % 2 == 0){
            return power(x, n/2) * power(x, n/2);
        }
        //if n is odd
        else{
            return power(x, n/2) * power(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x=2, n=5;
        int power = power(x,n);
        System.out.println("The power of "+x+" raised to the power of "+n+" is "+power);
    }
}
