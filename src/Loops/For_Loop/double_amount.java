package Loops.For_Loop;

public class double_amount {
    public static void main(String[] args) {
        // double amount for 30 days starting from 2.0 and doubling every day
        int days = 30;
        double amount = 2.0;

        for (int i = 1; i <= days; i++) {
            amount *= 2;
            System.out.println("Day " + i + ": " + amount);
        }
    }
}
