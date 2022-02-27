package com.gj.exercise_1;

import java.util.ArrayList;

/**
 *
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度
 *
 */
public class Exercise_38 {

    public static int count = 0;
//    public int TreeDepth(gj.gj.exercise_1.TreeNode root) {
//
//        if (root==null) return 0;
//
//        return Math.max(TreeDepth(root.left),TreeDepth(root.right)) + 1;
//    }


    public int TreeDepth(TreeNode root) {

        if (root==null) return 0;

        ArrayList<Integer>array = new ArrayList<>();

        find(root,array);
        return count;
    }

    public static void find(TreeNode root,ArrayList<Integer>array){
        array.add(root.val);
        if (root.left==null && root.right==null){
            if (array.size()>=count){
                count = array.size();
            }
            return;
        }

        ArrayList<Integer> array2= new ArrayList<>();
        array2.addAll(array);
        if (root.left!=null){
            find(root.left,array);
        }

        if (root.right!=null){
            find(root.right,array2);
        }
    }




}
