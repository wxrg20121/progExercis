package com.gj.exercise_9.exercise_12;

public class Exercise_19 {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if (head==null) return null;
        ListNode cur = head;
        ListNode pre = head;
        for (int i = 0; i < n; i++) {
            cur = cur.next;
            if (cur==null) return head.next;
        }
        while (cur.next!=null){
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
