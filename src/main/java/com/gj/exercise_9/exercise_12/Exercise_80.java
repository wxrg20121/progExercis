package com.gj.exercise_9.exercise_12;

import java.util.ArrayList;

public class Exercise_80 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>arrayList_all = backracking(4,2);
        System.out.println(arrayList_all);
    }

    public static ArrayList<ArrayList<Integer>> backracking(int n, int k){
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        backracking(n,k,1,arrayList_all,new ArrayList<>());
        return arrayList_all;
    }

    public static void backracking(int n, int k, int start, ArrayList<ArrayList<Integer>>arrayList_all,ArrayList<Integer>arrayList){
        if (k<0){
            return;
        }else if (k==0){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        for (int i = start; i <= n; i++) {
            arrayList.add(i);
            backracking(n,k-1,i+1,arrayList_all,arrayList);
            arrayList.remove(arrayList.size()-1);
        }
    }
}
