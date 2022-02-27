package com.gj.Exercise_8;

public class Exercise_10 {
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        if (root==null) return -1;
        if (root.val==o1 || root.val==o2) return root.val;
        int lefe = lowestCommonAncestor(root.left,o1,o2);
        int right = lowestCommonAncestor(root.right,o1,o2);
        if (lefe==-1) return right;
        if (right==-1) return lefe;
        return root.val;
    }
}
