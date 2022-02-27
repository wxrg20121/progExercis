package com.gj.Exercise_8;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise_27 {
    public boolean isComplete(TreeNode root){
        if (root==null) return false;
        Queue<TreeNode>queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()){
            root = queue.poll();
            if (flag){
                if (root.left!=null&&root.right!=null){
                    queue.offer(root.left);
                    queue.offer(root.right);
                }else if (root.left==null&&root.right!=null){
                    return false;
                }else if (root.left!=null&&root.right==null){
                    queue.offer(root.left);
                    flag=false;
                }else {
                    flag=false;
                }
            }else {
                if (root.left!=null||root.right!=null) return false;
            }
        }
        return true;
    }
}
