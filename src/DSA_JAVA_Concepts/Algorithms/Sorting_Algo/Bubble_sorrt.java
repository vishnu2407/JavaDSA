package DSA_JAVA_Concepts.Algorithms.Sorting_Algo;

import java.util.Arrays;

public class Bubble_sorrt {

    //Ascending order
    public static void printAscending(int[] arr){
        for(int i = 0; i < arr.length-1; i++){ //n-1
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Ascending order:" + Arrays.toString(arr));
    }

    //Descending order
    public static void printDescending(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Descending order:" + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};

        //Time Complexity: O(n^2)

        //bubble sort ascending order
        printAscending(arr);

        //bubble sort descending order
        printDescending(arr);
    }
}
