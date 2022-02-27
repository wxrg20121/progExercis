package com.gj.Exercise_7;

import java.util.ArrayList;

public class Exercise_25 {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> arrayList = spiralOrder(matrix);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        ArrayList<Integer>arrayList = new ArrayList<>();
        if(rows==0 || cols==0) return arrayList;
        int layers = (Math.min(rows,cols)-1)/2 + 1;
        int count = 0;

        while (count<layers){
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
