package com.gj.Exercise_7;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise_70 {
    public ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        Arrays.sort(num);
        hel(num,new boolean[num.length],new ArrayList<>());
        return arrayList_all;
    }
    public void hel(int[]num,boolean[] used,ArrayList<Integer>arrayList){
        if (arrayList.size()==num.length){
            arrayList_all.add(new ArrayList(arrayList));
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (used[i]==true) continue;
            if (i>0 && num[i-1]==num[i] && !used[i-1]) continue;
            used[i] = true;
            arrayList.add(num[i]);
            hel(num,used,arrayList);
            arrayList.remove(arrayList.size()-1);
            used[i] = false;
        }
    }
}
