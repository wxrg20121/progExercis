package com.gj.exercise_5;

public class Exercise_31 {
    public boolean hasPath (char[][] matrix, String word) {
        // write code here
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] vistited = new boolean[rows*cols];
        char[] strs = word.toCharArray();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (judge(matrix,strs,vistited,rows,cols,i,j,0)) return true;
            }
        }
        return false;
    }
    public boolean judge(char[][] matrix,char[] strs, boolean[] vistited, int rows,int cols, int i, int j, int k){
        int visted_pos = i*cols + j;
        if (i<0 || i>=rows || j<0 || j>=cols || vistited[visted_pos]==true || matrix[i][j]!=strs[k]){
            return false;
        }
        if (k==strs.length-1){
            return true;
        }
        vistited[visted_pos]=true;
        if (judge(matrix,strs,vistited,rows,cols,i-1,j,k+1)
                ||judge(matrix,strs,vistited,rows,cols,i+1,j,k+1)
                ||judge(matrix,strs,vistited,rows,cols,i,j-1,k+1)
                ||judge(matrix,strs,vistited,rows,cols,i,j+1,k+1)
                )
            return true;
        vistited[visted_pos]=false;
        return false;
    }
}
