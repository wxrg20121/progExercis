package com.gj.exercise_9;

import java.util.ArrayList;
import java.util.Stack;

public class Exercise_4 {
    public int[][] threeOrders (TreeNode root) {
        // write code here
        if (root==null) return null;
        ArrayList<Integer> preArr = preOrder(root);
        ArrayList<Integer> midArr = midOrder(root);
        ArrayList<Integer> backArr = backOrder(root);
        int[][] res = new int[3][preArr.size()];
        for (int i = 0; i < preArr.size(); i++) {
            res[0][i]=preArr.get(i);
            res[1][i]=midArr.get(i);
            res[2][i]=backArr.get(i);
        }
        return res;
    }
    public ArrayList<Integer> preOrder(TreeNode root){
        ArrayList<Integer>arrayList = new ArrayList<>();
        if (root==null) return arrayList;
        Stack<TreeNode>stack = new Stack<>();
        while (root!=null || !stack.isEmpty()){
            if (root!=null){
                stack.push(root);
                arrayList.add(root.val);
                root = root.left;
            }else {
                root = stack.pop();
                root = root.right;
            }
        }
        return arrayList;
    }

    public ArrayList<Integer> midOrder(TreeNode root){
        ArrayList<Integer>arrayList = new ArrayList<>();
        if (root==null) return arrayList;
        Stack<TreeNode>stack = new Stack<>();
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
        return arrayList;
    }

    public ArrayList<Integer> backOrder(TreeNode root){
        ArrayList<Integer>arrayList = new ArrayList<>();
        if (root==null) return arrayList;
        Stack<TreeNode>stack = new Stack<>();
        Stack<TreeNode>stack2 = new Stack<>();
        while (root!=null || !stack.isEmpty()){
            if (root!=null){
                stack.push(root);
                stack2.push(root);
                root = root.right;
            }else {
                root = stack.pop();
                root = root.left;
            }
        }
        while (!stack2.isEmpty()){
            arrayList.add(stack2.pop().val);
        }
        return arrayList;
    }

}
