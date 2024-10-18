package Basic_Java_Concepts.Sample;

public class LargestDigit {

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        LargestDigit obj = new LargestDigit();
        System.out.println(obj.findLargestDigit(9, 99, 999, 9999, 99999));
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");
    }

    private double findLargestDigit(double a, double b, double c, double d , double e) {
        double max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        if (e > max) {
            max = e;
        }
        return max;
    }
}
