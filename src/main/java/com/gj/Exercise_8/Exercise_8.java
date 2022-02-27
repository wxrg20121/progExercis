package com.gj.Exercise_8;

public class Exercise_8 {
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
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
