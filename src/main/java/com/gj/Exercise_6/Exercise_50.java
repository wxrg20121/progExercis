package com.gj.Exercise_6;

public class Exercise_50 {
    int maxval = Integer.MIN_VALUE;
    public int maxPathSum (TreeNode root) {
        // write code here
        hel(root);
        return maxval;
    }
    public int hel(TreeNode root){
        if (root==null) return 0;
        int left = Math.max(0,hel(root.left));
        int right = Math.max(0,hel(root.right));
        maxval = Math.max(maxval,left+right+root.val);
        return Math.max(left,right) + root.val;
    }
}
