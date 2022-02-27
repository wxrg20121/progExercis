package com.gj.exercise_5;

public class Exercise_19 {
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        if (root==null){
            return -1;
        }
        if (o1==root.val || o2==root.val){
            return root.val;
        }
        int left = lowestCommonAncestor(root.left,o1,o2);
        int right = lowestCommonAncestor(root.right,o1,o2);
        if (left==-1){
            return right;
        }
        if (right==-1){
            return left;
        }
        return root.val;

    }
}
