package com.gj.exercise_9.exercise_12;

public class Exercise_51 {
    int sum = 0;
    public int sumNumbers (TreeNode root) {
        // write code here
        hel(root, new StringBuffer());
        return sum;
    }

    public void hel(TreeNode root, StringBuffer sb){
        if (root==null) return;
        sb.append(root.val);
        if (root.left==null && root.right==null){
            sum += Integer.parseInt(sb.toString());
        }
        hel(root.left,sb);
        hel(root.right,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}
