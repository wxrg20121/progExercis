package com.gj.exercise_11;


class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}

public class Exercise_1 {
    public ListNode ReverseList(ListNode head) {
        if (head==null) return head;
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
