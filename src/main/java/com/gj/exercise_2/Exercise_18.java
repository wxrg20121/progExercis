package com.gj.exercise_2;

/**
 *
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */

public class Exercise_18 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot==null){
            return pRoot;
        }
        TreeNode node = pRoot.left;
        pRoot.left = Mirror(pRoot.right);
        pRoot.right = Mirror(node);
        return pRoot;
    }
}
