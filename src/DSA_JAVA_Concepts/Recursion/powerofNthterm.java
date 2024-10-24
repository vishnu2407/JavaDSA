package DSA_JAVA_Concepts.Recursion;

public class powerofNthterm {
    public static int power(int x, int n){
        if (n == 0) { //Base case 1
        return 1;
        }
        if (x == 0) { //Base case 2
        return 0;
        }
        return x * power(x,n-1); //Recursive case
    }
    public static void main(String[] args) {
        int x=5, n=2;
        int power = power(x,n);
        System.out.println("The power of "+x+" raised to the power of "+n+" is "+power);
    }
}
