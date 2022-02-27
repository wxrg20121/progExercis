package com.gj.exercise_9.exercise_12;

public class Exercise_96 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot==null) return pRoot;
        TreeNode temp = pRoot.left;
        pRoot.left = Mirror(pRoot.right);
        pRoot.right = Mirror(temp);
        return pRoot;
    }
}
