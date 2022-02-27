package com.gj.exercise_9.exercise_12;

public class Exercise_40 {
    public int maxDepth (TreeNode root) {
        // write code here
        if (root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
