package com.gj.exercise_2;

/**
 *
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */

public class Exercise_65 {
    public int movingCount(int threshold, int rows, int cols) {
        boolean [] vistieds  = new boolean[rows*cols];
        return hel(vistieds, threshold,rows,cols,0,0);
    }

    public int hel(boolean[] vistieds, int threshold,int rows,int cols,int i,int j){
        int is_visited_pos = i*cols + j;
        if (i<0||i>=rows||j<0||j>=cols||vistieds[is_visited_pos]==true||getnum(i)+getnum(j)>threshold){
            return 0;
        }

        vistieds[is_visited_pos] = true;
        return hel(vistieds, threshold,rows,cols,i+1,j)+
        hel(vistieds, threshold,rows,cols,i-1,j)+
        hel(vistieds, threshold,rows,cols,i,j+1)+
        hel(vistieds, threshold,rows,cols,i,j-1)+1;

    }

    public int getnum(int x){
        int sum = 0;
        while (x>0){
            sum += x%10;
            x = x/10;
        }
        return sum;
    }
}
