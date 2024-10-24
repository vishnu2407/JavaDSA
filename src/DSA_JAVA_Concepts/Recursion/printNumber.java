package DSA_JAVA_Concepts.Recursion;

public class printNumber {
    public static void printNumber(int n) {
        if(n==6)
            return;
        System.out.print(n+" ");
        printNumber(n+1);
    }
    public static void main(String[] args) {
        printNumber(1);
    }
}
