package com.gj.Exercise_7;

public class Exercise_89 {
    public boolean searchMatrix (int[][] matrix, int target) {
        // write code here
        int i = matrix.length-1;
        int j = 0;
        while (i>=0 && j<=matrix[0].length-1){
            if (matrix[i][j]==target){
                return true;
            }else if (matrix[i][j]<target){
                j++;
            }else {
                i--;
            }
        }
        return false;
    }
}
