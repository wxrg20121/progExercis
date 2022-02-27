package com.gj.exercise_2;

import java.util.Stack;

/**
 *
 *输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 *
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}


public class Exercise_4 {

    //
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
        backOrder3(treeNode1);
        int [] pre = {1,2,4,7,3,5,6,8};
        int [] in = {4,7,2,1,5,3,8,6};

    }

    public static void preOrder(TreeNode treeNode){

        if (treeNode==null) return;
        System.out.println(treeNode.val);
        preOrder(treeNode.left);
        preOrder(treeNode.right);
    }

    public static void midOrder(TreeNode treeNode){
        if (treeNode==null) return;
        midOrder(treeNode.left);
        System.out.println(treeNode.val);
        midOrder(treeNode.right);

    }

    public static void backOrder(TreeNode treeNode){
        if (treeNode==null) return;
        backOrder(treeNode.left);
        backOrder(treeNode.right);
        System.out.println(treeNode.val);
    }


    public static void preOrder2(TreeNode treeNode){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pNode = treeNode;
        while (pNode!=null || !stack.isEmpty()){
            if (pNode!=null){
                System.out.println(pNode.val);
                stack.push(pNode);
                pNode=pNode.left;
            }else {
                pNode = stack.pop();
                pNode = pNode.right;
            }
        }
    }

    public static void midOrder2(TreeNode treeNode){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pNode = treeNode;
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

    public static void backOrder2(TreeNode treeNode){
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode pNode = treeNode;
        while (pNode!=null || !stack1.isEmpty()){
            if (pNode!=null){
                stack1.push(pNode);
                stack2.push(pNode);
                pNode = pNode.right;
            }else {
                pNode = stack1.pop();
                pNode = pNode.left;
            }
        }
        while (!stack2.isEmpty()){
            pNode = stack2.pop();
            System.out.println(pNode.val);
        }
    }

    public static void backOrder3(TreeNode treeNode){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pNode = treeNode;
        TreeNode preNode = treeNode;
        while (pNode!=null || !stack.isEmpty()){
            if (pNode!=null){
                stack.push(pNode);
                pNode = pNode.left;
            }else {
                pNode = stack.pop();
                if (pNode.right==null || preNode==pNode.right){
                    System.out.println(pNode.val);
                    preNode = pNode;
                    pNode = null;
                }else {
                    stack.push(pNode);
                    pNode = pNode.right;
                }
            }
        }
    }







    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        if (pre==null || in==null || in.length!=pre.length){
            return null;
        }
        TreeNode root = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);

        return root;
    }


    public TreeNode reConstructBinaryTree(int []pre, int preLeft, int preRight, int []in, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preLeft]);
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[preLeft]) {
                root.left = reConstructBinaryTree(pre, preLeft + 1, i - inLeft + preLeft, in, inLeft, i - 1);
                root.right = reConstructBinaryTree(pre, i - inLeft + preLeft + 1, preRight, in, i + 1, inRight);
                break;
            }
        }

        return root;
    }




}
