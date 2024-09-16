package Loops;

public class double_amount {
    public static void main(String[] args) {
        int days = 30;
        double amount = 2.0;

        for (int i = 1; i <= days; i++) {
            amount *= 2;
            System.out.println("Day " + i + ": " + amount);
        }
    }
}
