package com.gj.exercise_9;

public class Exercise_23 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length!=in.length)return null;
        return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }

    public TreeNode reConstructBinaryTree(int [] pre,int preleft,int preright,int [] in,int inleft,int inright) {
        if (preleft>preright || inleft>inright) return null;
        TreeNode root = new TreeNode(pre[preleft]);
        for (int i = inleft; i <= inright; i++) {
            if (in[i]==pre[preleft]){
                root.left = reConstructBinaryTree(pre,preleft+1,i-inleft+preleft,in,inleft,i-1);
                root.right = reConstructBinaryTree(pre,i-inleft+preleft+1,preright,in,i+1,inright);
            }
        }
        return root;
    }
}
