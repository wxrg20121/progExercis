package com.gj.exercise_9.exercise_12;

import java.util.*;

public class Exercise_27 {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        int rows = matrix.length;
        if (rows==0) return arrayList;
        int cols = matrix[0].length;
        if (rows==0||cols==0) return arrayList;
        int layers = (Math.min(rows,cols)-1)/2 + 1;
        int count = 0;
        while (count<layers){
            for (int i = count; i <= cols-count-1; i++) {
                arrayList.add(matrix[count][i]);
            }
            for (int i = count+1; i <= rows-count-1; i++) {
                arrayList.add(matrix[i][cols-count-1]);
            }
            for (int i = cols-count-2; i >=count && count!=rows-count-1; i--) {
                arrayList.add(matrix[rows-count-1][i]);
            }
            for (int i = rows-count-2; i >count && count!=cols-count-1 ; i--) {
                arrayList.add(matrix[i][count]);
            }
            count++;
        }
        return arrayList;

    }
}
