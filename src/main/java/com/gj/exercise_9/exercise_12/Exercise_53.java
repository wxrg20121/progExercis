package com.gj.exercise_9.exercise_12;

public class Exercise_53 {
    public ListNode reverseBetween (ListNode head, int m, int n) {
        if (head==null) return head;
        ListNode phead = new ListNode(0);
        phead.next = head;
        ListNode pre = phead;
        ListNode cur = head;
        for (int i = 1; i < m; i++) {
            pre = cur;
            cur = cur.next;
        }
        for (int i = 0; i < n-m; i++) {
            ListNode node = cur.next;
            cur.next = node.next;
            node.next = pre.next;
            pre.next = node;
        }
        return phead.next;
    }
}
