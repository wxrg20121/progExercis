package com.gj.exercise_9.exercise_12;

public class Exercise_25 {
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        if (root==null) return -1;
        if (root.val==o1 || root.val==o2) return root.val;
        int left = lowestCommonAncestor(root.left,o1,o2);
        int right = lowestCommonAncestor(root.right,o1,o2);
        if (left==-1) return right;
        if (right==-1) return left;
        return root.val;
    }
}
