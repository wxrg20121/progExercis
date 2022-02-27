package com.gj.Exercise_8;

public class Exercise_37 {
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if (root==null) return false;
        sum -= root.val;
        if (sum==0&&root.left==null && root.right==null) return true;
        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }
}
