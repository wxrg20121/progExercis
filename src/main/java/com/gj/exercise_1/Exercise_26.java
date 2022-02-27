package com.gj.exercise_1;

import java.util.Stack;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Exercise_26 {

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null){
            return pRootOfTree;
        }

        Stack<TreeNode>stack = new Stack<TreeNode>();

        boolean isfirst = true;
        TreeNode firstListNode = null;
        TreeNode preNode = null;
        while (pRootOfTree!=null || !stack.isEmpty()){
            if (pRootOfTree != null){
                stack.push(pRootOfTree);
                pRootOfTree = pRootOfTree.left;
            }else {
                pRootOfTree = stack.pop();
                if (isfirst){
                    firstListNode = pRootOfTree;
                    preNode = pRootOfTree;
                    isfirst = false;
                }else {
                    preNode.right = pRootOfTree;
                    pRootOfTree.left = preNode;
                    preNode = pRootOfTree;
                }
                pRootOfTree = pRootOfTree.right;
            }
        }
        return firstListNode;
    }

//    public gj.gj.exercise_1.TreeNode Convert(gj.gj.exercise_1.TreeNode pRootOfTree) {
//        if (pRootOfTree==null){
//            return pRootOfTree;
//        }
//
//        if (pRootOfTree.left==null && pRootOfTree.right==null){
//            return pRootOfTree;
//        }
//
//        gj.gj.exercise_1.TreeNode left = Convert(pRootOfTree.left);
//
//        gj.gj.exercise_1.TreeNode p = left;
//        while (p!=null && p.right!=null){
//            p = p.right;
//        }
//        if (left!=null){
//            p.right = pRootOfTree;
//            pRootOfTree.left = p;
//        }
//
//        gj.gj.exercise_1.TreeNode right = Convert(pRootOfTree.right);
//        if (right!=null){
//            right.left = pRootOfTree;
//            pRootOfTree.right = right;
//        }
//
//        return left!=null?left:pRootOfTree;
//    }
}
