package com.gj.exercise_2;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 *给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 *
 */


class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}


public class Exercise_57 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode==null){
            return null;
        }
        TreeLinkNode node = pNode;
        while (node.next!=null){
            node = node.next;
        }
        ArrayList<TreeLinkNode> arrayList = minNode(node);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)==pNode){
                if (i<arrayList.size()-1){
                    return arrayList.get(i+1);
                }
            }
        }
        return null;
    }

    public ArrayList<TreeLinkNode> minNode(TreeLinkNode pnode){
        ArrayList<TreeLinkNode> arrayList = new ArrayList<>();
        if (pnode==null){
            return arrayList;
        }
        Stack<TreeLinkNode> stack = new Stack<>();
        while (pnode!=null || !stack.isEmpty()){
            if (pnode!=null){
                stack.push(pnode);
                pnode = pnode.left;
            }else {
                pnode = stack.pop();
                arrayList.add(pnode);
                pnode = pnode.right;
            }
        }
        return arrayList;
    }

}
