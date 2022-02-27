package com.gj.exercise_9;

public class Exercise_57 {
    public boolean isSymmetric (TreeNode root) {
        // write code here
        if (root==null) return true;
        return hel(root.left,root.right);
    }

    public boolean hel(TreeNode root1,TreeNode root2){
        if (root1==null && root2==null) return true;
        if (root1==null || root2==null) return false;
        if (root1.val!=root2.val) return false;
        return hel(root1.left,root2.right) && hel(root1.right,root2.left);
    }
}
