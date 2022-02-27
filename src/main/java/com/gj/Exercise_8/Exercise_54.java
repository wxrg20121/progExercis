package com.gj.Exercise_8;

public class Exercise_54 {
    int max = 0;
    public int solve (int[][] matrix) {
        // write code here
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                hel(matrix,rows,cols,i,j,0,-1);
            }
        }
        return max;
    }
    public void hel(int[][]matrix,int rows,int cols,int i,int j,int count,int pre){
        if (i<0||i>=rows||j<0||j>=cols||matrix[i][j]<=pre){
            max = Math.max(max,count);
            return;
        }
        hel(matrix,rows,cols,i+1,j,count+1,matrix[i][j]);
        hel(matrix,rows,cols,i-1,j,count+1,matrix[i][j]);
        hel(matrix,rows,cols,i,j+1,count+1,matrix[i][j]);
        hel(matrix,rows,cols,i,j-1,count+1,matrix[i][j]);
    }
}
