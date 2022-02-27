package com.gj.exercise_9;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_63 {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);
        hel(num,new boolean[num.length],arrayList_all,new ArrayList<>());
        return arrayList_all;
    }

    public void hel(int[]num,boolean[]used,ArrayList<ArrayList<Integer>>arrayList_all,ArrayList<Integer>arrayList){
        if (arrayList.size()==num.length){
            arrayList_all.add(new ArrayList<>(arrayList));
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (used[i]) continue;
            if (i>0 && num[i-1]==num[i] && !used[i-1]) continue;
            used[i] = true;
            arrayList.add(num[i]);
            hel(num,used,arrayList_all,arrayList);
            arrayList.remove(arrayList.size()-1);
            used[i] = false;
        }
    }

}
