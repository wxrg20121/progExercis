package com.gj.exercise_9.exercise_12;
import java.util.*;

public class Exercise_21 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrayLists_all = new ArrayList<ArrayList<Integer>>();
        if (pRoot==null) return arrayLists_all;
        Stack<TreeNode>stack1 = new Stack<>();
        Stack<TreeNode>stack2 = new Stack<>();
        stack1.push(pRoot);
        int label = 1;
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            ArrayList<Integer>arrayList = new ArrayList<>();
            if (label%2!=0){
                while (!stack1.isEmpty()){
                    pRoot = stack1.pop();
                    arrayList.add(pRoot.val);
                    if (pRoot.left!=null) stack2.push(pRoot.left);
                    if (pRoot.right!=null) stack2.push(pRoot.right);

                }
            }else {
                while (!stack2.isEmpty()){
                    pRoot = stack2.pop();
                    arrayList.add(pRoot.val);
                    if (pRoot.right!=null) stack1.push(pRoot.right);
                    if (pRoot.left!=null) stack1.push(pRoot.left);
                }
            }
            arrayLists_all.add(arrayList);
            label++;
        }
        return arrayLists_all;
    }
}
