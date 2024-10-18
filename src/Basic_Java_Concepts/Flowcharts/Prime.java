package Basic_Java_Concepts.Flowcharts;

public class Prime {
    public static void main(String[] args) {

        // Your code for the main method goes here, if needed
        int number = 7;
        boolean isPrime = true;
        // 2 is the smallest prime number
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        // print the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
