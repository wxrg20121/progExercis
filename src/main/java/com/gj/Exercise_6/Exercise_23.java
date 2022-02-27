package com.gj.Exercise_6;

import java.util.ArrayList;

public class Exercise_23 {
    public int[] getMinStack (int[][] op) {
        // write code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < op.length; i++) {
            if (op[i][0]==1){
                arrayList.add(op[i][1]);
            }else if (op[i][0]==2){
                arrayList.remove(arrayList.size()-1);
            }else if (op[i][0]==3){
                res.add(getMin(arrayList));
            }
        }
        int []r = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            r[i] = res.get(i);
        }
        return r;
    }
    public int getMin(ArrayList<Integer>arrayList){
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            if (max>=arrayList.get(i)){
                max = arrayList.get(i);
            }
        }
        return max;

    }
}
