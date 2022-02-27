package com.gj.Exercise_6;

public class Exercise_51 {
    public boolean isSymmetric (TreeNode root) {
        // write code here
        if (root==null) return true;
        return judge(root.left,root.right);
    }

    public boolean judge(TreeNode root1,TreeNode root2){
        if (root1==null&&root2==null){
            return true;
        }
        if (root1==null || root2==null){
            return false;
        }
        if (root1.val!=root2.val)
            return false;
        return judge(root1.left,root2.right) && judge(root1.right,root2.left);
    }
}
