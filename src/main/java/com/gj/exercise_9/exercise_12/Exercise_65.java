package com.gj.exercise_9.exercise_12;
import java.util.*;

public class Exercise_65 {
    public ArrayList<String> generateParenthesis (int n) {
        ArrayList<String>arrayList = new ArrayList<>();
        hel(n,n,new String(),arrayList);
        return arrayList;
    }

    public void hel(int left, int right, String res, ArrayList<String> arrayList){
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
