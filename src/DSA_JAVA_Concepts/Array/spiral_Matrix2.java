package DSA_JAVA_Concepts.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spiral_Matrix2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original Matrix form: " + Arrays.deepToString(matrix));
       spiral_Matrix2(matrix);
    }
    public static void spiral_Matrix2(int[][] matrix) {
        // Write your code here
        List<Integer> ans = new ArrayList<>();

        int top =0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix.length-1;
        while(top<=bottom && left<=right){
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
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
}}
