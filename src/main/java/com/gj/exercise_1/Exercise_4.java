package com.gj.exercise_1;

import java.util.Arrays;
import java.util.Stack;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 *
 *
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
//        backOrderTraverse3(treeNode1);
        int [] pre = {1,2,4,7,3,5,6,8};
        int [] in = {4,7,2,1,5,3,8,6};
        treeNode1 = reConstructBinaryTree(pre,in);
        midOrderTraverse3(treeNode1);
        midOrderTraverse5(treeNode1);


    }


    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        if (pre.length==0){
            return null;
        }
        int headval = pre[0];
        TreeNode treeNode = new TreeNode(headval);

        if (pre.length==1){
            return treeNode;
        }


        int headindex = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i]==headval){
                headindex = i;
                break;
            }
        }


        treeNode.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,headindex+1),Arrays.copyOfRange(in,0,headindex));
        treeNode.right = reConstructBinaryTree(Arrays.copyOfRange(pre,headindex+1,pre.length),Arrays.copyOfRange(in,headindex+1,in.length));


        return treeNode;
    }


    public static void preOrderTraverse1(TreeNode treeNode){
        if (treeNode==null){
            return;
        }

        System.out.println(treeNode.val);
        if (treeNode.left!=null){
            preOrderTraverse1(treeNode.left);
        }
        if (treeNode.right!=null){
            preOrderTraverse1(treeNode.right);
        }

    }

    public static void preOrderTraverse2 (TreeNode treeNode){
        Stack<TreeNode> linkedNode = new Stack<TreeNode>();
        TreeNode hnode = treeNode;
        while (hnode != null || !linkedNode.isEmpty()){

            if (hnode!=null){
                System.out.println(hnode.val);
                linkedNode.push(hnode);
                hnode = hnode.left;
            }else {
                if (!linkedNode.empty()){
                    hnode = linkedNode.pop();
                    hnode = hnode.right;
                }
            }
        }

    }


    public static void midOrderTraverse3 (TreeNode treeNode){
        Stack<TreeNode> stackNode = new Stack<TreeNode>();
        TreeNode rnode = treeNode;
        while (rnode != null || !stackNode.isEmpty()){
            if (rnode !=null){
                stackNode.push(rnode);
                rnode = rnode.left;
            }else {
                rnode = stackNode.pop();
                System.out.println(rnode.val);
                rnode = rnode.right;
            }
        }
    }


    public static void backOrderTraverse3 (TreeNode treeNode){
        Stack<TreeNode> stackNode1 = new Stack<TreeNode>();
        Stack<TreeNode> stackNode2 = new Stack<TreeNode>();
        TreeNode rnode = treeNode;
        while (rnode != null || !stackNode1.isEmpty()){
           if (rnode !=null){
               stackNode1.push(rnode);
               stackNode2.push(rnode);
               rnode = rnode.right;
           }else {
               rnode = stackNode1.pop();
               rnode = rnode.left;
           }
        }
        while (!stackNode2.isEmpty()){
            System.out.println(stackNode2.pop().val);
        }
    }



    public static void midOrderTraverse4(TreeNode rNode){
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while (rNode!=null || !stack.isEmpty()){
            if (rNode!=null){
                stack.push(rNode);
                rNode = rNode.left;
            }else {
                rNode = stack.pop();
                System.out.println(rNode.val);
                rNode = rNode.right;
            }

        }
    }

    public static void midOrderTraverse5(TreeNode rNode){
        if (rNode==null){
            return;
        }

        if (rNode.left!=null){
            midOrderTraverse5(rNode.left);
        }
        System.out.println(rNode.val);
        if (rNode.right!=null){
            midOrderTraverse5(rNode.right);
        }

    }



}











