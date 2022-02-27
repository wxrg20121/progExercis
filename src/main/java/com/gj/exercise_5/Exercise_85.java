package com.gj.exercise_5;

public class Exercise_85 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot==null) return pRoot;
        TreeNode left = pRoot.left;
        pRoot.left = Mirror(pRoot.right);
        pRoot.right = Mirror(left);
        return pRoot;
    }
}
