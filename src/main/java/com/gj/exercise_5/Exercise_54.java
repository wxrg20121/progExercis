package com.gj.exercise_5;

public class Exercise_54 {
    int maxval = Integer.MIN_VALUE;
    public int maxPathSum (TreeNode root) {
        // write code here
        maxdown(root);
        return maxval;
    }
    public int maxdown(TreeNode root){
        if (root==null)
            return 0;
        int left = Math.max(0,maxdown(root.left));
        int right = Math.max(0,maxdown(root.right));
        maxval = Math.max(maxval,left+right+root.val);
        return Math.max(left,right)+root.val;
    }

}
