package com.gj.exercise_2;

import java.util.Stack;

/**
 *
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */

public class Exercise_26 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null){
            return pRootOfTree;
        }
        boolean isFirstNode = true;
        TreeNode preNode = null;
        TreeNode firstNode = null;

        Stack<TreeNode> stack = new Stack<>();
        while (pRootOfTree!=null || !stack.isEmpty()){
            if (pRootOfTree!=null){
                stack.push(pRootOfTree);
                pRootOfTree = pRootOfTree.left;
            }else {
                pRootOfTree = stack.pop();
                if (isFirstNode){
                    firstNode = pRootOfTree;
                    preNode = firstNode;
                    isFirstNode = false;
                }else {
                    preNode.right = pRootOfTree;
                    pRootOfTree.left = preNode;
                    preNode = pRootOfTree;
                }
                pRootOfTree = pRootOfTree.right;
            }
        }
        return firstNode;

    }


}
