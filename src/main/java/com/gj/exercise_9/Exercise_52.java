package com.gj.exercise_9;

public class Exercise_52 {
    public int[] findElement(int[][] mat, int n, int m, int x) {
        // write code here
        int i=n-1;
        int j=0;
        int[] res = new int[2];
        while (i>=0 && j<m){
            if (mat[i][j]==x){
                res[0]=i;
                res[1]=j;
                return res;
            }else if (mat[i][j]>x){
                i--;
            }else {
                j++;
            }
        }
        return res;
    }
}
