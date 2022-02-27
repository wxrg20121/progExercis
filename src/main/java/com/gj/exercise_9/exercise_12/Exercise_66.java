package com.gj.exercise_9.exercise_12;

public class Exercise_66 {
    public int[][] rotateMatrix(int[][] mat, int n) {
        int[][]res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n-1-i] = mat[i][j];
            }
        }
        return res;
    }
}
