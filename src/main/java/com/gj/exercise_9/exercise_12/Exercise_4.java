package com.gj.exercise_9.exercise_12;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

public class Exercise_4 {

    public int[][] threeOrders (TreeNode root) {
        // write code here
        ArrayList<Integer> pre = preOrder(root);
        ArrayList<Integer> mid = midOrder(root);
        ArrayList<Integer> back = backOrder(root);
        int[][] res = new int[3][pre.size()];
        for (int i = 0; i < pre.size(); i++) {
            res[0][i] = pre.get(i);
            res[1][i] = mid.get(i);
            res[2][i] = back.get(i);
        }
        return res;
    }

    public static ArrayList<Integer> preOrder(TreeNode root){
        ArrayList<Integer>arrayList = new ArrayList<>();
        if (root==null) return arrayList;
        Stack<TreeNode> stack = new Stack<>();
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

    public static ArrayList<Integer> midOrder(TreeNode root){
        ArrayList<Integer>arrayList = new ArrayList<>();
        if (root==null)return arrayList;
        Stack<TreeNode> stack = new Stack<>();
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

    public static ArrayList<Integer> backOrder(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null) return arrayList;
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
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
