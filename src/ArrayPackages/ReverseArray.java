package ArrayPackages;

public class ReverseArray {
    public static void main(String[] args) {
        // Your code for the main method goes here, if needed
        int [] arr = {1, 2, 3, 4, 5};
        for (int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
