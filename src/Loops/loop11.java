package Loops;

public class loop11 {
    public static void main(String[] args) {
        while (true) {
            int num = (int) (Math.random() * 10 + 1);
            if (num == 3) {
                break;
            }
            if (num % 4 == 0) {
                System.out.print("Hello");
                continue;
            }
            System.out.print(num + " ");
        }
    }
}
