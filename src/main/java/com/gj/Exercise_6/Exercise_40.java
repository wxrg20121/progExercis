package com.gj.Exercise_6;

import java.util.ArrayList;

public class Exercise_40 {
    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        // write code here
        ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
        hel(root,sum,arrayList_all,new ArrayList<>());
        return arrayList_all;

    }

    public void hel(TreeNode root,int sum,ArrayList<ArrayList<Integer>> arrayList_all,ArrayList<Integer>arrayList){
        if (root==null) return;
        arrayList.add(root.val);
        if (root.left==null && root.right==null){
            if (root.val==sum){
                arrayList_all.add(new ArrayList<>(arrayList));
            }
        }
        hel(root.left,sum-root.val,arrayList_all,arrayList);
        hel(root.right,sum-root.val,arrayList_all,arrayList);
        arrayList.remove(arrayList.size()-1);
    }
}
