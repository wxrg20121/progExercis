package com.gj.exercise_5;

import java.util.ArrayList;

public class Exercise_68 {
    ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        Exercise_68 exercise_68 = new Exercise_68();
        exercise_68.subsets();

    }

    public ArrayList<ArrayList<Integer>> subsets() {
        backtracking(4,2,1,new ArrayList<>());
        for (ArrayList a :arrayList_all
                ) {
            System.out.println(a.size());
        }
        return arrayList_all;
    }

    public void backtracking(int n,int k,int start,ArrayList<Integer> arrayList){
        if (k<0){
            return;
        }else if (k==0){
            arrayList_all.add(new ArrayList<>(arrayList));
        }else {
            for (int i = start; i <= n; i++) {
                arrayList.add(i);
                backtracking(n,k-1,i+1,arrayList);
                arrayList.remove(arrayList.size()-1);
            }
        }
    }





}
