package com.gj.exercise_5;

import java.util.ArrayList;

public class Exercise_27 {
    public int[] getMinStack (int[][] op) {
        // write code here
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<Integer>res = new ArrayList<>();
        for (int i = 0; i < op.length; i++) {
            if (op[i][0]==1){
                list.add(op[i][1]);
            }else if (op[i][0]==2){
                list.remove(list.size()-1);
            }else if (op[i][0]==3){
                res.add(getmin(list));
            }
        }
        int[] r = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            r[i] = res.get(i);
        }
        return r;
    }

    public int getmin(ArrayList<Integer>list){
        int max = Integer.MAX_VALUE;
        for (Integer emt:list) {
            if (max>emt){
                max=emt;
            }
        }
        return max;
    }
}
