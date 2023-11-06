package Loops;



public class loop9 {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 10) {
            if (num == 5)
                break;
            System.out.println(num);
            num++;
        }
        System.out.println("After the loop");
    }
}
