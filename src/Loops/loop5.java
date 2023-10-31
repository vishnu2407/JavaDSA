package Loops;
import java.util.Scanner;
public class loop5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        int num = 5;
        do {
            System.out.println(num);
            num--;
        } while (num >= 0);
    }
}

