package com.gj.Exercise_8;


class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

public class Exercise_4 {
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        ListNode phead = new ListNode(0);
        ListNode p = phead;
        while (l1!=null && l2!=null){
            if (l1.val<l2.val){
                p.next = l1;
                l1 = l1.next;
            }else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        p.next = (l1==null)?l2:l1;
        return phead.next;
    }
}
