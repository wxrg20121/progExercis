package com.gj.exercise_9.exercise_12;

import java.util.Stack;

public class Exercise_102 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null) return pRootOfTree;
        TreeNode pre = null;
        TreeNode firstnode = null;
        boolean isfirst = true;
        Stack<TreeNode> stack = new Stack<>();
        while (pRootOfTree!=null||!stack.isEmpty()){
            if (pRootOfTree!=null){
                stack.push(pRootOfTree);
                pRootOfTree = pRootOfTree.left;
            }else {
                pRootOfTree = stack.pop();
                if (isfirst){
                    firstnode = pRootOfTree;
                    pre = firstnode;
                    isfirst = false;
                }else {
                    pre.right = pRootOfTree;
                    pRootOfTree.left = pre;
                    pre = pRootOfTree;
                }
                pRootOfTree = pRootOfTree.right;
            }
        }
        return firstnode;
    }
}
