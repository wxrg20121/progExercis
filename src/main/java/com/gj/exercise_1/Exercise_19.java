package com.gj.exercise_1;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * 输入 [[1,2],[3,4]]
 * 输出 [1,2,4,3]
 *
 */
public class Exercise_19 {

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> arrayList = printMatrix_2(matrix);
        for (Integer integer:arrayList) {
            System.out.println(integer);
        }
    }
    public static ArrayList<Integer> printMatrix_2(int [][] matrix) {
        int rows = matrix.length;
        if (rows==0) return null;
        int cols = matrix[0].length;
        if (cols==0) return null;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int layer = (Math.min(rows,cols) - 1)/2 + 1;
        int count = 0;
        while (count < layer){
            for (int i = count; i <= cols-1-count; i++) {
                arrayList.add(matrix[count][i]);
            }
            for (int i = count+1; i <= rows-1-count; i++) {
                arrayList.add(matrix[i][cols-1-count]);
            }
            for (int i = cols-2-count; i >= count && rows-1-count!=count; i--) {
                arrayList.add(matrix[rows-1-count][i]);
            }
            for (int i = rows-2-count; i > count && cols-1-count!=count; i--) {
                arrayList.add(matrix[i][count]);
            }
            count ++;
        }

        return arrayList;
    }



    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer>array = new ArrayList<Integer>();
        if (matrix.length==0) {
            return array;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (cols==0) {
            return array;
        }
        int layer = (Math.min(rows, cols)-1)/2+1;
        int count = 0;
        while (count<layer) {
            for (int i = count; i < cols-count; i++) {
                array.add(matrix[count][i]);
            }
            for (int i = count+1; i < rows-count; i++) {
                array.add(matrix[i][cols-count-1]);
            }
            for (int i = cols-count-2; i >=count&&rows-count-1!=count ; i--) {
                array.add(matrix[rows-count-1][i]);
            }
            for (int i = rows-count-2; i >=count+1&&cols-count-1!=count; i--) {
                array.add(matrix[i][count]);
            }
            count++;
        }
        return array;
    }

    public static void hel(int [][] matrix,int left,int right,int high,int low,ArrayList<Integer> arrayList){
        if (left>right || high>low){
            return;
        }
        int x = left;
        int y = high;
        while (x<=right){
            arrayList.add(matrix[y][x]);
            x++;
        }
        x--;
        y++;
        while (y<=low){
            arrayList.add(matrix[y][x]);
            y++;
        }
        y--;
        x--;
        while (x>=left && matrix.length != 1){
            arrayList.add(matrix[y][x]);
            x--;
        }
        x++;
        y--;
        while (y>high && matrix[0].length != 1){
            arrayList.add(matrix[y][x]);
            y--;
        }
        hel(matrix,left+1,right-1,high+1,low-1,arrayList);

    }

}
