package ArrayPackages;

import java.util.Scanner;

public class ArrayMin
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //Main logic
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}