package ArrayPackages;

public class ArrayClass2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            // Access an element that is out of bounds
            int index = 9;
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}