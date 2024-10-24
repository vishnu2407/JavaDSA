package DSA_JAVA_Concepts.Recursion;

public class FibonacciSequence {
    public static void printFibonacci(int a, int b, int n) {
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        printFibonacci(b,c,n-1);
    }
    public static void main(String[] args) {
        int a =0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n =7;
        System.out.print("Fibonacci Series: ");
        printFibonacci(a,b,n);

        //Regular Fibonacci using for loop method
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the number of terms: ");
        // int a=0, b=1;
        //int n = sc.nextInt();
        //for(int i=0;i<n;i++){
        // int c = a+b;
        // a=b;
        // b=c;
        // System.out.print(c+" ");}



    }
}
