package Array;

public class Richest_Person {
    public static void main(String[] args) {
        int[][] accounts={{1,2,3, 4},{3,2,1,5},{3,2,1,6}};
        System.out.println(maximumWealth(accounts));
    }

    private static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}
