package com.gj.Exercise_7;

public class Exercise_98 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot==null) return pRoot;
        TreeNode temp = pRoot.left;
        pRoot.left = Mirror(pRoot.right);
        pRoot.right = Mirror(temp);
        return pRoot;
    }
}
