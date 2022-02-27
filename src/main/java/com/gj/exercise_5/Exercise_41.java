package com.gj.exercise_5;

import java.util.ArrayList;

public class Exercise_41 {
    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        // write code here
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        hel(arrayList_all,new ArrayList<>(),root,sum);
        return arrayList_all;

    }
    public void hel(ArrayList<ArrayList<Integer>>arrayList_all,ArrayList<Integer>arrayList,TreeNode root, int sum){
        if (root==null)
            return;
        arrayList.add(root.val);
        if (root.left==null && root.right==null){
            if (root.val==sum){
                arrayList_all.add(arrayList);
            }
            return;
        }
        ArrayList<Integer>arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);
        hel(arrayList_all,arrayList,root.left,sum-root.val);
        hel(arrayList_all,arrayList2,root.right,sum-root.val);
    }
}
