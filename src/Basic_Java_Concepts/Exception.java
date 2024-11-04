package Basic_Java_Concepts;

public class Exception {
    public static void main(String[] args) {
        int i =5, j=0;
        try{
            System.out.println(i/j);
        }
        catch (ArithmeticException ae){
            System.out.println("Wrong input");
        }
        System.out.println("Statement after try-catch block");
    }
}
