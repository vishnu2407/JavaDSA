package ArrayPackages;
import java.lang.*;

public class ArrayClassLength
{
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {6, 7, 8, 9, 10};

    public static void main(String[] args){
        ArrayClassLength obj = new ArrayClassLength();

        System.out.println("arr1:");
        for (int i = 0; i < obj.arr1.length; i++){
            System.out.print(obj.arr1[i] + " ");
        }
        System.out.println();

        System.out.println("arr2:");
        for (int i = 0; i < obj.arr2.length; i++){
            System.out.print(obj.arr2[i] + " ");
        }
        System.out.println();

//        System.out.println("arr1: " + Arrays.toString(obj.arr1));
//        System.out.println("arr2: " + Arrays.toString(obj.arr2));
    }
}
