package com.gj2.exercise_2;

public class Exercise_16 {
    int sum = 0;
    public int sumNumbers (TreeNode root) {
        // write code here
        backracking(root,new StringBuffer());
        return sum;
    }

    public void backracking(TreeNode root,StringBuffer sb){
        if (root==null) return;
        sb.append(root.val);
        if (root.left==null&&root.right==null){
            sum += Integer.parseInt(sb.toString());
        }
        backracking(root.left,sb);
        backracking(root.right,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}
