package com.gj.exercise_9.exercise_12;

public class Exercise_64 {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot==null) return true;
        return hel(pRoot.left,pRoot.right);
    }

    public boolean hel(TreeNode left,TreeNode right){
        if (left==null) return right==null;
        if (right==null) return false;
        if (left.val!=right.val) return false;
        return hel(left.left,right.right) && hel(left.right,right.left);
    }
}
