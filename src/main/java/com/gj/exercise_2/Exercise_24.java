package com.gj.exercise_2;

import java.util.ArrayList;

/**
 *
 * 输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 *
 */

public class Exercise_24 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> arrayAll = new ArrayList<ArrayList<Integer>>();

        if (root==null){
            return arrayAll;
        }
        hel(root,target,arrayAll,new ArrayList<>());
        return arrayAll;
    }

    public void hel(TreeNode root,int target,ArrayList<ArrayList<Integer>> arrayAll,ArrayList<Integer>array){
        array.add(root.val);
        if (root.left==null && root.right==null){
            if (root.val==target){
                arrayAll.add(array);
            }
            return;
        }

        ArrayList<Integer>array2 = new ArrayList<>();
        array2.addAll(array);

        if (root.left!=null){
            hel(root.left,target-root.val,arrayAll,array);
        }
        if (root.right!=null){
            hel(root.right,target-root.val,arrayAll,array2);
        }
    }



}
