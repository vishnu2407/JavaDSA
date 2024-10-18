package DSA_JAVA_Concepts.Linear_DS.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spiral_Matrix1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Original Matrix form: " + Arrays.deepToString(matrix));

        spiralMatrix(matrix);
    }
    public static void spiralMatrix(int[][] matrix) {
        // Write your code here
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int left=0;
        int right=n-1;
        int top=0;
        int bottom= m-1;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
            }
            left++;
        }
        System.out.println(ans);
    }
}