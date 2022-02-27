package com.gj.exercise_3;

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
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.right = treeNode6;
        treeNode5.left = treeNode7;
        treeNode5.right = treeNode8;
        backOrder2(treeNode1);
        int [] pre = {1,2,4,7,3,5,6,8};
        int [] in = {4,7,2,1,5,3,8,6};

    }

    public static void preOrder(TreeNode phead){
        if (phead==null){
            return;
        }
        System.out.println(phead.val);
        preOrder(phead.left);
        preOrder(phead.right);
    }

    public static void preOrder2(TreeNode phead){
        Stack<TreeNode>stack = new Stack<>();
        while (phead!=null || !stack.isEmpty()){
            if (phead!=null){
                System.out.println(phead.val);
                stack.push(phead);
                phead = phead.left;
            }else {
                phead = stack.pop();
                phead = phead.right;
            }
        }
    }

    public static void midOrder(TreeNode pNode){
        Stack<TreeNode>stack = new Stack<>();
        while (pNode!=null || !stack.isEmpty()){
            if (pNode!=null){
                stack.push(pNode);
                pNode = pNode.left;
            }else {
                pNode = stack.pop();
                System.out.println(pNode.val);
                pNode = pNode.right;
            }
        }
    }

    public static void backOrder(TreeNode pNode){
        Stack<TreeNode>stack = new Stack<>();
        Stack<TreeNode>stack2 = new Stack<>();
        while (pNode!=null || !stack.isEmpty()){
            if (pNode!=null){
                stack.push(pNode);
                stack2.push(pNode);
                pNode = pNode.right;
            }else {
                pNode = stack.pop();
                pNode = pNode.left;
            }
        }
        while (!stack2.isEmpty()){
            System.out.println(stack2.pop().val);
        }
    }

    public static void backOrder2(TreeNode pNode){
        Stack<TreeNode>stack = new Stack<>();
        TreeNode pre = pNode;
        while (pNode!=null || !stack.isEmpty()){
            if (pNode!=null){
                stack.push(pNode);
                pNode = pNode.left;
            }else {
                pNode = stack.pop();
                if (pNode.right==null || pNode.right==pre){
                    System.out.println(pNode.val);
                    pre = pNode;
                    pNode = null;
                }else {
                    stack.push(pNode);
                    pNode = pNode.right;
                }
            }
        }
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length==0||in.length==0||pre.length!=in.length){
            return null;
        }
        return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }


    public TreeNode reConstructBinaryTree(int []pre, int preLeft, int preRight, int []in, int inLeft, int inRight) {

        if (preLeft>preRight || inLeft>inRight){
            return null;
        }
        TreeNode root = new TreeNode(pre[preLeft]);
        for (int i = inLeft; i <=inRight ; i++) {
            if (in[i]==pre[preLeft]){
                root.left = reConstructBinaryTree(pre,preLeft+1,i-inLeft+preLeft,in,inLeft,i-1);
                root.right = reConstructBinaryTree(pre,i-inLeft+preLeft+1,preRight,in,i+1,inRight);
                break;
            }
        }
        return root;
    }



    }
