package Loops;
import java.util.Scanner;
public class loop8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<=10; i++){
            if(i==4){
                System.out.println("Breaking out of the loop");
                continue;
            }
            System.out.println(i);
        }
    }
}
