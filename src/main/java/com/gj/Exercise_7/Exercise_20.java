package com.gj.Exercise_7;

import java.util.ArrayList;
import java.util.Stack;

public class Exercise_20 {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        if (root==null) return arrayList_all;
        Stack<TreeNode>stack1 = new Stack<>();
        Stack<TreeNode>stack2 = new Stack<>();
        int label = 1;
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            ArrayList<Integer>arrayList = new ArrayList<>();
            if (label%2!=0){
                while (!stack1.isEmpty()){
                    root = stack1.pop();
                    arrayList.add(root.val);
                    if (root.left!=null)stack2.push(root.left);
                    if (root.right!=null)stack2.push(root.right);
                }
            }else {
                while (!stack2.isEmpty()){
                    root = stack2.pop();
                    arrayList.add(root.val);
                    if (root.right!=null)stack1.push(root.right);
                    if (root.left!=null)stack1.push(root.left);
                }
            }
            arrayList_all.add(arrayList);
            label++;
        }
        return arrayList_all;
    }
}
