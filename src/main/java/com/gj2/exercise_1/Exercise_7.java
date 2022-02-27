package com.gj2.exercise_1;

public class Exercise_7 {
    public boolean isContains (TreeNode root1, TreeNode root2) {
        // write code here
        if (root1==null) return false;
        if (helIsContains(root1,root2)) return true;
        return isContains(root1.left,root2)||isContains(root1.right,root2);
    }

    public boolean helIsContains(TreeNode root1,TreeNode root2){
        if (root1==null) return root2==null;
        if (root2==null) return false;
        if (root1.val==root2.val){
            return helIsContains(root1.left,root2.left) && helIsContains(root1.right,root2.right);
        }
        return false;
    }

}

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val){
        this.val = val;
    }
}
