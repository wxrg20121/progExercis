package com.gj.exercise_5;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise_62 {
    public String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        Queue<TreeNode>queue = new LinkedList<>();
        if (root!=null){
            queue.offer(root);
        }
        while (!queue.isEmpty()){
            root = queue.poll();
            if (root!=null){
                queue.offer(root.left);
                queue.offer(root.right);
                sb.append(root.val + ",");
            }else {
                sb.append("#,");
            }
        }
        if (sb.length()!=0)
            sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public TreeNode Deserialize(String str) {
        TreeNode head = null;
        if (str==null || str.length()==0){
            return head;
        }
        String []nodes = str.split(",");
        TreeNode[] treeNodes = new TreeNode[nodes.length];
        for (int i = 0; i < nodes.length; i++) {
            if (!nodes[i].equals("#")){
                treeNodes[i] = new TreeNode(Integer.parseInt(nodes[i]));
            }
        }

        for (int i = 0,j=1; i < treeNodes.length; i++) {
            if (treeNodes[i]!=null){
                treeNodes[i].left = treeNodes[j++];
                treeNodes[i].right = treeNodes[j++];
            }
        }
        return treeNodes[0];


    }


}
