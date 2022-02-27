package com.gj2.exercise_4;

public class Exercise_1 {
    public ListNode ReverseList(ListNode head) {
        if (head==null) return head;
        ListNode pre = null;
        while (head.next!=null){
            ListNode node = head.next;
            head.next = pre;
            pre = head;
            head = node;
        }
        head.next = pre;
        return head;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}