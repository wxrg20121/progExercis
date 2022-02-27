package com.gj.exercise_3;



public class Exercise_65 {
    public boolean hasPath (String matrix, int rows, int cols, String str) {
        // write code here

        char[] matrixs = matrix.toCharArray();
        boolean[] isvisted = new boolean[rows*cols];
        char[] strs = str.toCharArray();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (fun(matrixs,strs,isvisted,rows,cols,i,j,0)){
                    return true;
                }

            }
        }

        return false;

    }

    public boolean fun(char[] matrixs, char[] strs, boolean []isvisted, int rows, int cols, int i, int j, int k){
        int isvisted_index = i*cols + j;
        if (i<0 || i>=rows || j<0 || j>=rows || isvisted[isvisted_index]==true || matrixs[isvisted_index]!=strs[k]){
            return false;
        }
        if (k==strs.length-1){
            return true;
        }
        isvisted[isvisted_index] = true;
        if (fun(matrixs, strs, isvisted, rows, cols, i-1, j, k+1)
                ||fun(matrixs, strs, isvisted, rows, cols, i+1, j, k+1)
                ||fun(matrixs, strs, isvisted, rows, cols, i, j-1, k+1)
                ||fun(matrixs, strs, isvisted, rows, cols, i, j+1, k+1))
            return true;
        isvisted[isvisted_index] = false;
        return false;
    }




}
