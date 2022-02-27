package com.gj.exercise_2;

import java.util.ArrayList;

/**
 *
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */


public class Exercise_19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows==0 || cols==0){
            return arrayList;
        }
        int layer = (Math.min(rows,cols)-1)/2 + 1;
        int count = 0;
        while (count<layer){
            for (int i = count; i <= cols-count-1; i++) {
                arrayList.add(matrix[count][i]);
            }
            for (int i = count+1; i <= rows-count-1; i++) {
                arrayList.add(matrix[i][cols-count-1]);
            }
            for (int i = cols-count-2; i >=count && rows-count-1!=count; i--) {
                arrayList.add(matrix[rows-count-1][i]);
            }
            for (int i = rows-count-2; i >count && cols-count-1!=count; i--) {
                arrayList.add(matrix[i][count]);
            }
            count++;
        }
        return arrayList;


    }
}
