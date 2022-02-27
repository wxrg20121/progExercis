package com.gj.exercise_9.exercise_12;
import java.util.*;

public class Exercise_52 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
        hel(root,target,arrayList_all,new ArrayList<>());
        return arrayList_all;
    }
    public void hel(TreeNode root, int target, ArrayList<ArrayList<Integer>> arrayList_all, ArrayList<Integer>arrayList){
        if (root==null) return;
        arrayList.add(root.val);
        if (root.left==null && root.right==null){
            if (root.val==target){
                arrayList_all.add(arrayList);
                return;
            }
        }
        ArrayList<Integer>arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);
        hel(root.left,target-root.val,arrayList_all,arrayList);
        hel(root.right,target-root.val,arrayList_all,arrayList2);
    }
}
