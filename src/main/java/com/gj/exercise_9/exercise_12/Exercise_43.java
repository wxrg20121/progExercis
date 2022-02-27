package com.gj.exercise_9.exercise_12;

public class Exercise_43 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root==null) return true;
        if (Math.abs(getdepth(root.left)-getdepth(root.right))>1) return false;
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    public int getdepth(TreeNode root){
        if (root==null) return 0;
        return Math.max(getdepth(root.left),getdepth(root.right)) + 1;
    }
}
