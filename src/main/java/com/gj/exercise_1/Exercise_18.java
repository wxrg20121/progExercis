package com.gj.exercise_1;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Exercise_18 {
    public void Mirror(TreeNode root) {
        if (root==null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null){
            Mirror(root.left);
        }
        if (root.right != null){
            Mirror(root.right);
        }
    }
}

