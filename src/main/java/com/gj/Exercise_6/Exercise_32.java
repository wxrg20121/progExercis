package com.gj.Exercise_6;

public class Exercise_32 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root==null) return true;
        if (Math.abs(getDepth(root.left)-getDepth(root.right))>1) return false;
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
    public int getDepth(TreeNode root){
        if (root==null) return 0;
        return Math.max(getDepth(root.left),getDepth(root.right)) + 1;
    }
}
