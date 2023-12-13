package ArrayPackages;

public class ReverseArray {
    public static void main(String[] args) {
        // Your code for the main method goes here, if needed
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = arr.length-1; i >= 0; i--){
            System.out.println("Value at index " + i + " : " + arr[i]);
        }
    }
}
