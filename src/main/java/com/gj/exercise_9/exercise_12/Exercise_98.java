package com.gj.exercise_9.exercise_12;

public class Exercise_98 {
    public boolean isContains (TreeNode root1, TreeNode root2) {
        if (root1==null) return false;
        if (hel(root1,root2)) return true;
        return isContains(root1.left,root2) || isContains(root1.right,root2);
    }

    public boolean hel(TreeNode root1,TreeNode root2){
        if (root1==null && root2==null) return true;
        if (root1==null || root2==null) return false;
        if (root1.val==root2.val){
            return hel(root1.left,root2.left)&&hel(root1.right,root2.right);
        }
        return false;
    }
}
