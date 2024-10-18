package Basic_Java_Concepts.Sample;

public class FindSum {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        FindSum obj = new FindSum();
        System.out.println(obj.findSum(999));
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");
    }
    private int findSum(int n) {
        return (n * (n + 1)) / 2;
//        int sum=0;
//        for(int i=1;i<=n;i++){
//            sum+=i;
//        }
//        return sum;
    }
}


