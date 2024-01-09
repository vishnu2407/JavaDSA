package Loops;

public class whileLoop1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //while loop in java
        //Q: print numbers from 1 to 10 using while loop
        /*syntax for while loop
            while(condition)
            {
                //body of while loop
            }
        */
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 2; // i = i + 1;
            i++;
        }
    }
}
