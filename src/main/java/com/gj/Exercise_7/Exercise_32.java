package com.gj.Exercise_7;

import java.util.ArrayList;

public class Exercise_32 {
    public int[] getMinStack (int[][] op) {
        // write code here
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < op.length; i++) {
            int opt = op[i][0];
            if (opt==1){
                arrayList1.add(op[i][1]);
            }else if (opt==2){
                arrayList1.remove(arrayList1.size()-1);
            }else if (opt==3){
                arrayList2.add(getMin(arrayList1));
            }
        }
        int[] res = new int[arrayList2.size()];
        for (int i = 0; i < arrayList2.size(); i++) {
            res[i] = arrayList2.get(i);
        }
        return res;
    }

    public int getMin(ArrayList<Integer> arrayList){
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            if (res>=arrayList.get(i)){
                res = arrayList.get(i);
            }
        }
        return res;
    }
}
