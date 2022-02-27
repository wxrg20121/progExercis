package com.gj.exercise_9;

import java.util.ArrayList;

public class Exercise_42 {
    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        // write code here
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        hel(root,sum,new ArrayList<>(),arrayList_all);
        return arrayList_all;
    }

    public void hel(TreeNode root, int sum,ArrayList<Integer>arrayList,ArrayList<ArrayList<Integer>>arrayList_all){
        if (root==null) return;
        arrayList.add(root.val);
        if (sum==root.val && root.left==null && root.right==null){
            arrayList_all.add(new ArrayList<>(arrayList));
        }
        hel(root.left,sum-root.val,arrayList,arrayList_all);
        hel(root.right,sum-root.val,arrayList,arrayList_all);
        arrayList.remove(arrayList.size()-1);
    }
}
