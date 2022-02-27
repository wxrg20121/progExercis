package com.gj.Exercise_7;

public class Exercise_38 {
    public int solve (char[][] grid) {
        // write code here
        if (grid==null || grid.length==0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j]=='1'){
                    hel(grid,rows,cols,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void hel(char[][]grid,int rows,int cols,int i,int j){
        if (i<0||i>=rows||j<0||j>=cols||grid[i][j]=='2'||grid[i][j]=='0') return;
        grid[i][j] = '2';
        hel(grid,rows,cols,i+1,j);
        hel(grid,rows,cols,i-1,j);
        hel(grid,rows,cols,i,j+1);
        hel(grid,rows,cols,i,j-1);
    }
}
