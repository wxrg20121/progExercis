package com.gj.exercise_2;

import java.util.Stack;

/**
 *
 *
 *给定一棵二叉搜索树，请找出其中的第k小的TreeNode结点。
 *
 *
 *
 */

public class Exercise_61 {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot==null){
            return pRoot;
        }
        Stack<TreeNode>stack = new Stack<>();
        int count = 1;
        while (pRoot !=null || !stack.isEmpty()){
            if (pRoot!=null){
                stack.push(pRoot);
                pRoot = pRoot.left;
            }else {
                pRoot = stack.pop();
                if (count==k){
                    return pRoot;
                }
                count++;
                pRoot = pRoot.right;
            }
        }
        return null;
    }
}
