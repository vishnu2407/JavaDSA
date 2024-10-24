package DSA_JAVA_Concepts.Recursion;

public class printNumbersinReverse {
    public static void printNumbersinReverse(int n) {
        if(n==0)
            return;

        System.out.print(n + " ");
        printNumbersinReverse(n-1);
    }

    public static void main(String[] args) {
        printNumbersinReverse(50);
    }
}
