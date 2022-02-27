package com.gj.Exercise_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercise_55 {
    public boolean[] judgeIt (TreeNode root) {
        // write code here
        boolean []res = new boolean[]{true,true};
        if (root==null) return res;
        res[0] = isSearch(root);
        res[1] = isComplete(root);
        return res;
    }

    public boolean isSearch(TreeNode root){
        if (root==null) return false;
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (root!=null || !stack.isEmpty()){
            if (root!=null){
                stack.push(root);
                root = root.left;
            }else {
                root = stack.pop();
                arrayList.add(root.val);
                root = root.right;
            }
        }
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i)<=arrayList.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public boolean isComplete(TreeNode root){
        if (root==null) return false;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()){
            root = queue.poll();
            if (flag){
                if (root.left!=null && root.right!=null){
                    queue.offer(root.left);
                    queue.offer(root.right);
                }else if (root.left==null && root.right!=null){
                    return false;
                }else if (root.left!=null && root.right==null){
                    queue.offer(root.left);
                    flag = false;
                }else {
                    flag = false;
                }
            }else {
                if (root.left!=null || root.right!=null){
                    return false;
                }
            }
        }
        return true;
    }

}
