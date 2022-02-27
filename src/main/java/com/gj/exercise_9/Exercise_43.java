package com.gj.exercise_9;

public class Exercise_43 {
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        if (head==null) return head;
        ListNode phead = new ListNode(0);
        phead.next = head;
        ListNode pre = phead,cur = head;
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
