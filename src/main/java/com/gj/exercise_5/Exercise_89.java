package com.gj.exercise_5;

public class Exercise_89 {
    private int res = 0;
    public int solve (int[][] matrix) {
        // write code here
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dfs(matrix,rows,cols,i,j,0,-1);
            }
        }
        return res;
    }

    public void dfs(int[][]matrix,int rows,int cols,int i,int j,int count,int pre){
        if (i<0||i>=rows||j<0||j>=cols||matrix[i][j]<=pre){
            res = Math.max(res,count);
            return;
        }
        dfs(matrix,rows,cols,i+1,j,count+1,matrix[i][j]);
        dfs(matrix,rows,cols,i-1,j,count+1,matrix[i][j]);
        dfs(matrix,rows,cols,i,j-1,count+1,matrix[i][j]);
        dfs(matrix,rows,cols,i,j+1,count+1,matrix[i][j]);
    }
}
