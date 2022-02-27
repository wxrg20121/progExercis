package com.gj.Exercise_7;

import java.util.ArrayList;

public class Exercise_64 {
    public ArrayList<String> generateParenthesis (int n) {
        // write code here
        ArrayList<String> arrayList = new ArrayList<>();
        hel(n,n,"",arrayList);
        return arrayList;
    }

    public void hel(int left,int right,String s,ArrayList<String>arrayList){
        if (left==0 && right==0){
            arrayList.add(s);
            return;
        }
        if (left>0){
            hel(left-1,right,s+"(",arrayList);
        }
        if (right>0 && right>left){
            hel(left,right-1,s+")",arrayList);
        }
    }
}
