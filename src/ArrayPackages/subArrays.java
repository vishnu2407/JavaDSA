package ArrayPackages;

import java.util.Scanner;

public class subArrays {
    public static void main(String[] args) {

        // Your code for the main method goes here, if needed
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Main logic
        //int sI = 0;
        //int eI = 0;

        for(int sI = 0; sI < n; sI++){
            for(int eI = sI; eI < n; eI++){
                for(int k = sI; k <= eI; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
