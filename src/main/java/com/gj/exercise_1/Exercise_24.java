package com.gj.exercise_1;

import java.util.ArrayList;

/**
 * 输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * 输入 {10,5,12,4,7},22
 * 输出 [[10,5,7],[10,12]]
 *
 * 输入 {10,5,12,4,7},15
 * 输出 []
 */
public class Exercise_24 {


    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> arrayAll = new ArrayList<ArrayList<Integer>>();
        if (root==null){
            return arrayAll;
        }
        find(root,target,arrayAll,new ArrayList<Integer>());
        return arrayAll;
    }

    public static void find(TreeNode root,int target,ArrayList<ArrayList<Integer>> arrayAll,ArrayList<Integer>array){
        array.add(root.val);
        if (root.left==null && root.right==null){
            if (target==root.val){
                arrayAll.add(array);
            }
            return;
        }
        ArrayList<Integer> array_2 = new ArrayList<>();
        array_2.addAll(array);
        if (root.left!=null){
            find(root.left,target-root.val,arrayAll,array);
        }
        if (root.right!=null){
            find(root.right,target-root.val,arrayAll,array_2);
        }

    }


//    private ArrayList<ArrayList<Integer>> arrayAll = new ArrayList<ArrayList<Integer>>();
//    private ArrayList<Integer>array = new ArrayList<Integer>();
//    public ArrayList<ArrayList<Integer>> FindPath(gj.gj.exercise_1.TreeNode root, int target) {
//        if (root==null){
//            return arrayAll;
//        }
//        array.add(root.val);
//        target -= root.val;
//        if (target==0 && root.left==null&&root.right==null){
//            arrayAll.add(new ArrayList<Integer>(array));
//        }
//        FindPath(root.left,target);
//        FindPath(root.right,target);
//        array.remove(array.size()-1);
//        return arrayAll;
//    }




}
