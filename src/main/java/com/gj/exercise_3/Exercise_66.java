package com.gj.exercise_3;

public class Exercise_66 {
//    public int movingCount(int threshold, int rows, int cols) {
//        boolean []isvisted = new boolean[rows*cols];
//        return hel(isvisted,rows,cols,0,0,threshold);
//
//    }
//    public int hel(boolean []isvisted, int rows, int cols, int i, int j,int threshold){
//        int visted_pos = i * cols + j;
//        if (i<0 || i>=rows || j<0 || j>=cols || isvisted[visted_pos]==true || (getnum(i)+getnum(j))>threshold){
//            return 0;
//        }
//        isvisted[visted_pos] = true;
//        return hel(isvisted,rows,cols,i-1,j,threshold)
//                +hel(isvisted,rows,cols,i+1,j,threshold)
//                +hel(isvisted,rows,cols,i,j-1,threshold)
//                +hel(isvisted,rows,cols,i,j+1,threshold) + 1;
//    }
//
//    public int getnum(int num){
//        int x = 0;
//        while (num!=0){
//            x += num%10;
//            num /= 10;
//        }
//        return x;
//    }

    public static int count = 0;

    public static void main(String[] args) {
        int rows = 3;
        int cols = 1;
        boolean []isvisted = new boolean[rows*cols];
        hel(isvisted,rows,cols,0,0);
        System.out.println(count);
    }

    public static void hel(boolean []isvisted, int rows, int cols, int i, int j){
        int visted_pos = i * cols + j;
        if (i<0 || i>=rows || j<0 || j>=cols || isvisted[visted_pos]==true){
            return;
        }
        if (i==rows-1 && j==cols-1){
            count ++;
            return;
        }
        isvisted[visted_pos] = true;
        hel(isvisted, rows, cols, i-1, j);
        hel(isvisted, rows, cols, i, j+1);
    }
}
