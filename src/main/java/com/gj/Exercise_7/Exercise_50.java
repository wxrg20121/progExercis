package com.gj.Exercise_7;

import java.util.ArrayList;

public class Exercise_50 {
    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        // write code here
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        hel(root,sum,arrayList_all,new ArrayList<>());
        return arrayList_all;
    }

    public void hel(TreeNode root,int sum,ArrayList<ArrayList<Integer>> arrayList_all,ArrayList<Integer> arraylsit){
        if (root==null) return;
        arraylsit.add(root.val);
        if (root.left==null && root.right==null){
            if (root.val==sum){
                arrayList_all.add(new ArrayList<>(arraylsit));
            }
        }
        hel(root.left,sum-root.val,arrayList_all,arraylsit);
        hel(root.right,sum-root.val,arrayList_all,arraylsit);
        arraylsit.remove(arraylsit.size()-1);
    }
}
