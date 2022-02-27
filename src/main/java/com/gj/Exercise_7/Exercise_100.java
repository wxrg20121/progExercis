package com.gj.Exercise_7;

public class Exercise_100 {
    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        // write code here
        if (t1==null) return t2;
        if (t2==null) return t1;
        TreeNode node = new TreeNode(t1.val+t2.val);
        node.left = mergeTrees(t1.left,t2.left);
        node.right = mergeTrees(t1.right,t2.right);
        return node;
    }
}

