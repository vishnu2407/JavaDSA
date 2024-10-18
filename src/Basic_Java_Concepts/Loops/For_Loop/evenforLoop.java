package Basic_Java_Concepts.Loops.For_Loop;

public class evenforLoop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //for loop in java
        //Q: print numbers from 1 to 10 using for loop
        /*syntax for for loop
            for(initialization; condition; updation)
            {
                //body of for loop
            }
        */
        for (int i = 0; i <= 10; i+= 2) {
            System.out.print(i + " ");
        }
    }
}
