package com.gj.exercise_5;

import java.util.ArrayList;

public class Exercise_58 {
    public ArrayList<String> generateParenthesis (int n) {
        // write code here
        ArrayList<String> arrayList = new ArrayList<>();
        genPar(arrayList,n,n,"");
        return arrayList;
    }

    public void genPar(ArrayList<String> arrayList, int left, int right,String s){
        if (left==0 && right==0){
            arrayList.add(s);
        }
        if (left>0){
            genPar(arrayList,left-1,right,s+"(");
        }
        if (right>0 && right>left){
            genPar(arrayList,left,right-1,s+")");
        }
    }
}
