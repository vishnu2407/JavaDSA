package Loops;
//import java.util.Scanner;
public class loop7 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        for(int i =0; i<=20; i++){
            if(i==6){
                System.out.println("Breaking out of the loop");
               break;
            }
            System.out.println(i);
        }
    }
}
