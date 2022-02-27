package com.gj.exercise_9.exercise_12;

import java.util.*;

public class Exercise_6 {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>>arrayList_all = new ArrayList<ArrayList<Integer>>();
        if (root==null) return arrayList_all;
        int label = 1;
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(root);
        while (!queue1.isEmpty() || !queue2.isEmpty()){
            ArrayList<Integer>arrayList = new ArrayList<>();
            if (label%2!=0){
                while (!queue1.isEmpty()){
                    root = queue1.poll();
                    arrayList.add(root.val);
                    if (root.left!=null) queue2.offer(root.left);
                    if (root.right!=null) queue2.offer(root.right);
                }

            }else {
                while (!queue2.isEmpty()){
                    root = queue2.poll();
                    arrayList.add(root.val);
                    if (root.left!=null) queue1.offer(root.left);
                    if (root.right!=null) queue1.offer(root.right);
                }
            }
            arrayList_all.add(arrayList);
            label++;
        }
        return arrayList_all;
    }
}
