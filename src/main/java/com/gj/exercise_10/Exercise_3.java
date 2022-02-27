package com.gj.exercise_10;

class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}


public class Exercise_3 {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        if (head==null) return head;
        ListNode cur = head;
        ListNode p = head;
        for (int i = 0; i < n; i++) {
            cur = cur.next;
        }
        if (cur==null) return head.next;
        while (cur.next!=null){
            cur = cur.next;
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }
}
