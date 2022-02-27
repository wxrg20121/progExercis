package com.gj2.exercise_2;
import java.util.*;

public class Exercise_19 {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        dfs(num,new int[num.length],new ArrayList<>(),arrayList_all);
        return arrayList_all;
    }

    public void dfs(int[] num, int[] used, ArrayList<Integer>arrayList, ArrayList<ArrayList<Integer>>arrayList_all){
        if (arrayList.size()==num.length){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = 0; i < num.length; i++) {
            if (used[i]==0){
                used[i]=1;
                arrayList.add(num[i]);
                dfs(num,used,arrayList,arrayList_all);
                arrayList.remove(arrayList.size()-1);
                used[i]=0;
            }
        }
    }
}
