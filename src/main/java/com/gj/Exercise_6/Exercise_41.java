package com.gj.Exercise_6;

public class Exercise_41 {
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
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
