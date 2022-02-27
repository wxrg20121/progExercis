package com.gj.Exercise_6;

import java.util.ArrayList;

public class Exercise_53 {
    public ArrayList<String> generateParenthesis (int n) {
        // write code here
        ArrayList<String> arrayList = new ArrayList<>();
        hel(arrayList,n,n,"");
        return arrayList;
    }

    public void hel(ArrayList<String> arrayList,int left,int right,String s){
        if (left==0 && right==0){
            arrayList.add(s);
            return;
        }
        if (left>0){
            hel(arrayList,left-1,right,s+"(");
        }
        if (right>0 && right>left){
            hel(arrayList,left,right-1,s+")");
        }

    }
}
