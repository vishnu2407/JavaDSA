package Loops.While_Loop;

public class whileLoop2 {
    public static void main(String[] args) {
        String str = "Vishnu";
        // Reverse the string
        // using while loop
        // Print the reversed string
        while (str.length() > 0) {
            System.out.print(str.charAt(str.length() - 1));
            str = str.substring(0, str.length() - 1);
        }
    }
}
