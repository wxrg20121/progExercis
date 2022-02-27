package com.gj.exercise_5;

public class Exercise_40 {
    private int sum;
    public int sumNumbers (TreeNode root) {
        // write code here
        StringBuilder sb = new StringBuilder();
        hel(root,sb);
        return sum;
    }

    public void hel(TreeNode root,StringBuilder sb){
        if (root==null){
            return;
        }
        sb.append(root.val);
        if (root.left==null && root.right==null){
            sum += Integer.parseInt(sb.toString());
        }
        hel(root.left,sb);
        hel(root.right,sb);
        sb.deleteCharAt(sb.length()-1);
    }

}
