package com.gj.Exercise_7;

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

public class Exercise_1 {
    public ListNode ReverseList(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode pre = null;
        while (head!=null){
            ListNode node = head.next;
            head.next = pre;
            pre = head;
            head = node;
        }
        return pre;
    }
}
