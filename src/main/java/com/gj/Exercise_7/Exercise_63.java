package com.gj.Exercise_7;

public class Exercise_63 {
    public boolean isSymmetric (TreeNode root) {
        // write code here
        if (root==null) return true;
        return isSymmetric(root.left,root.right);
    }
    public boolean isSymmetric(TreeNode root1,TreeNode root2){
        if (root1==null && root2==null) return true;
        if (root1==null||root2==null) return false;
        if (root1.val!=root2.val) return false;
        return isSymmetric(root1.left,root2.right) && isSymmetric(root1.right,root2.left);
    }
}
