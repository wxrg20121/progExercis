package com.gj.exercise_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 *
 */

public class Exercise_60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrayList_all = new ArrayList<ArrayList<Integer>>();
        if (pRoot==null){
            return arrayList_all;
        }
        Queue<TreeNode> link1 = new LinkedList<>();
        Queue<TreeNode> link2 = new LinkedList<>();
        link1.offer(pRoot);
        int label = 1;
        while (!link1.isEmpty() || !link2.isEmpty()){
            ArrayList<Integer>arrayList = new ArrayList<>();
            if (label%2!=0){
                while (!link1.isEmpty()){
                    pRoot = link1.poll();
                    arrayList.add(pRoot.val);
                    if (pRoot.left!=null) link2.offer(pRoot.left);
                    if (pRoot.right!=null) link2.offer(pRoot.right);
                }
            }else {
                while (!link2.isEmpty()){
                    pRoot = link2.poll();
                    arrayList.add(pRoot.val);
                    if (pRoot.left!=null) link1.offer(pRoot.left);
                    if (pRoot.right!=null) link1.offer(pRoot.right);
                }
            }
            label++;

            arrayList_all.add(arrayList);
        }
        return arrayList_all;
    }
}
