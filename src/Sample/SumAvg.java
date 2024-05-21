package Sample;

public class SumAvg {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        SumAvg obj = new SumAvg();
        System.out.println(obj.SumAvg(199800, 1997600, 9999800));
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");
    }
    private int SumAvg(double a, double b, double c) {
        return (int) ((a + b + c) / 3);
    }
}
