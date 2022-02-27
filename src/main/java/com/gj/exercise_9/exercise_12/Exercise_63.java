package com.gj.exercise_9.exercise_12;

public class Exercise_63 {
    int res = Integer.MIN_VALUE;
    public int maxPathSum (TreeNode root) {
        hel(root);
        return res;
    }
    public int hel(TreeNode root){
        if (root==null) return 0;
        int left = Math.max(hel(root.left),0);
        int right = Math.max(hel(root.right),0);
        res = Math.max(res,left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}
