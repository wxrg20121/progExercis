package com.gj2.exercise_2;

public class Exercise_12 {
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        if (root==null) return -1;
        if (root.val==o1 || root.val==o2){
            return root.val;
        }
        int left = lowestCommonAncestor(root.left,o1,o2);
        int right = lowestCommonAncestor(root.right,o1,o2);
        if (left==-1) return right;
        if (right==-1) return left;
        return root.val;
    }
}

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val){
        this.val = val;
    }
}
