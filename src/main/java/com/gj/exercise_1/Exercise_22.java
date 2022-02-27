package com.gj.exercise_1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 *输入 {5,4,#,3,#,2,#,1}
 * 输出 [5,4,3,2,1]
 */
public class Exercise_22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (root==null){
            return arrayList;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<TreeNode>();
        linkedList.push(root);
        while (!linkedList.isEmpty()){
            TreeNode node = linkedList.pop();
            arrayList.add(node.val);
            if (node.left!=null){
                linkedList.add(node.left);
            }
            if (node.right!=null){
                linkedList.add(node.right);
            }
        }

        return arrayList;
    }
}
