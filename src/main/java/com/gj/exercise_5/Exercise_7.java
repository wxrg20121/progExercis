package com.gj.exercise_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise_7 {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>>arrayListAll = new ArrayList<ArrayList<Integer>>();

        if (root==null)return arrayListAll;
        Queue<TreeNode>link1 = new LinkedList<>();
        Queue<TreeNode>link2 = new LinkedList<>();
        link1.offer(root);
        int label = 1;
        while (!link1.isEmpty() || !link2.isEmpty()){
            ArrayList<Integer> arrayList = new ArrayList<>();
            if (label%2!=0){
                while (!link1.isEmpty()){
                    root = link1.poll();
                    arrayList.add(root.val);
                    if (root.left!=null)
                        link2.offer(root.left);
                    if (root.right!=null)
                        link2.offer(root.right);
                }
            }else {
                while (!link2.isEmpty()){
                    root = link2.poll();
                    arrayList.add(root.val);
                    if (root.left!=null){
                        link1.offer(root.left);
                    }
                    if (root.right!=null){
                        link1.offer(root.right);
                    }
                }
            }
            arrayListAll.add(arrayList);
            label++;
        }
        return arrayListAll;
    }
}
