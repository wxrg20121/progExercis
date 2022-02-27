package com.gj2.exercise_4;

public class Exercise_7 {
    int sum=0;
    public int sumNumbers (TreeNode root) {
        // write code here
        backrack(root,new StringBuffer());
        return sum;
    }

    public void backrack(TreeNode root,StringBuffer sb){
        if (root==null) return;
        sb.append(root.val);
        if (root.left==null && root.right==null){
            sum+=Integer.parseInt(sb.toString());
        }
        backrack(root.left,sb);
        backrack(root.right,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val){
        this.val = val;
    }
}
