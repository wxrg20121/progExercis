package com.gj2.exercise_4;
import java.util.*;
public class Exercise_10 {
    public ArrayList<String> generateParenthesis (int n) {
        // write code here
        ArrayList<String>arrayList = new ArrayList<>();
        dfs(n,n,"",arrayList);
        return arrayList;
    }

    public void dfs(int left,int right,String res, ArrayList<String>arrayList){
        if (left==0 && right==0){
            arrayList.add(res);
        }
        if (left>0){
            dfs(left-1,right,res+"(",arrayList);
        }
        if (right>0 && right>left){
            dfs(left,right-1,res+")",arrayList);
        }
    }
}
