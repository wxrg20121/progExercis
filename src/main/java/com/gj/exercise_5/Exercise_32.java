package com.gj.exercise_5;

public class Exercise_32 {

    public int solve (char[][] grid) {
        // write code here
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j]=='1'){
                    bfs(grid,rows,cols,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public void bfs(char[][]grid,int rows,int cols,int i,int j){
        if (i<0||i>=rows||j<0||j>=cols||grid[i][j]=='2' || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='2';
//        if (i>0 && grid[i-1][j]=='1'){
//            bfs(grid,rows,cols,i-1,j);
//        }
//        if (i+1<rows&&grid[i+1][j]=='1'){
//            bfs(grid,rows,cols,i+1,j);
//        }
//        if (j>0 && grid[i][j-1]=='1'){
//            bfs(grid,rows,cols,i,j-1);
//        }
//        if (j+1<cols&&grid[i][j+1]=='1'){
//            bfs(grid,rows,cols,i,j+1);
//
            bfs(grid,rows,cols,i-1,j);

            bfs(grid,rows,cols,i+1,j);

            bfs(grid,rows,cols,i,j-1);
            bfs(grid,rows,cols,i,j+1);
    }
}
