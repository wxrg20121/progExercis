package com.gj.exercise_9;

import java.util.ArrayList;

public class Exercise_58 {
    public ArrayList<String> generateParenthesis (int n) {
        // write code here
        ArrayList<String>arrayList = new ArrayList<>();
        hel(n,n,"",arrayList);
        return arrayList;
    }
    public void hel(int left, int right, String res, ArrayList<String>arrayList){
        if (left==0 && right==0){
            arrayList.add(res);
        }
        if (left>0){
            hel(left-1,right,res+"(",arrayList);
        }
        if (right>0 && right>left){
            hel(left,right-1,res+")",arrayList);
        }
    }
}
