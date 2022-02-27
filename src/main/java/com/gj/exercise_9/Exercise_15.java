package com.gj.exercise_9;

public class Exercise_15 {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if (head==null) return head;
        ListNode cur = head;
        ListNode pre = head;
        for (int i = 0; i < n; i++) {
            cur = cur.next;
        }
        if (cur==null) return head.next;
        while (cur.next!=null){
            cur = cur.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
