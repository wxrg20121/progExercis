package com.gj.exercise_9.exercise_12;

import java.util.ArrayList;
import java.util.Stack;

public class Exercise_109 {
    public int[] inorderTraversal (TreeNode root) {
        // write code here
        if (root==null) return null;
        ArrayList<Integer>arrayList = new ArrayList<>();
        Stack<TreeNode>stack = new Stack<>();
        while (root!=null||!stack.isEmpty()){
            if (root!=null){
                stack.push(root);
                root = root.left;
            }else {
                root = stack.pop();
                arrayList.add(root.val);
                root = root.right;
            }
        }
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }
}
