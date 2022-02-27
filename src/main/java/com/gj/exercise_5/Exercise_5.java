package com.gj.exercise_5;

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

public class Exercise_5 {
    public int[][] threeOrders (TreeNode root) {
        // write code here
        if (root==null){
            return null;
        }
        ArrayList<Integer>arrayList1 = preOrder(root);
        ArrayList<Integer>arrayList2 = midOrder(root);
        ArrayList<Integer>arrayList3 = backOrder(root);
        int [][]res = new int[3][arrayList1.size()];
        for (int i = 0; i < arrayList1.size(); i++) {
            res[0][i]=arrayList1.get(i);
            res[1][i]=arrayList2.get(i);
            res[2][i]=arrayList3.get(i);
        }
        return res;

    }

    public static ArrayList<Integer> preOrder(TreeNode root){
        Stack<TreeNode>stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
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
        Stack<TreeNode>stack = new Stack<>();
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
        return arrayList;
    }

    public static ArrayList<Integer> backOrder(TreeNode root){
        Stack<TreeNode>stack = new Stack<>();
        Stack<TreeNode>stack2 = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
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
