package com.gj.exercise_9;

public class Exercise_56 {
    int res = Integer.MIN_VALUE;
    public int maxPathSum (TreeNode root) {
        // write code here
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
