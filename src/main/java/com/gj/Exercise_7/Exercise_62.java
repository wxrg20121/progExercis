package com.gj.Exercise_7;

public class Exercise_62 {
    public int maxval = 0;
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
