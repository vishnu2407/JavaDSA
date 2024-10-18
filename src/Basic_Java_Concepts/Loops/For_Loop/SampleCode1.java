package Basic_Java_Concepts.Loops.For_Loop;

public class SampleCode1 {
    public static void main(String[] args) {
        //Write a simple Java program to print 100  to  50  exclude 75, 57 ?
        for(int i = 100; i>=50; i--){
            if(i == 75 || i == 57){
                continue;
            }
                System.out.print(i + " ");
        }
    }
}
