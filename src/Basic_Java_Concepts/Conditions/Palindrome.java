package Basic_Java_Concepts.Conditions;

public class Palindrome {
    public static void main(String[] args) {

        // Your code for the main method goes here, if needed
        int number = 121;
        boolean isPalindrome = true;
        int temp = number;
        int reverse = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }
        if (reverse != number) {
            isPalindrome = false;
        }
        if (isPalindrome) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}
