package Patterns;

public class Number_Pattern {
    public static void main(String[] args) {
        int rows = 3;
        int clo = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= clo; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
