package com.gj.Exercise_7;

public class Exercise_65 {
    public int[][] rotateMatrix(int[][] mat, int n) {
        // write code here
        int[][]res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n-1-i] = mat[i][j];
            }
        }
        return res;
    }
}
