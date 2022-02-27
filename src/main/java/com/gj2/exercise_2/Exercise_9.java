package com.gj2.exercise_2;

public class Exercise_9 {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if (head==null) return head;
        ListNode cur = head;
        for (int i = 0; i < n; i++) {
            cur = cur.next;
            if (cur==null){
                return head.next;
            }
        }
        ListNode pre = head;
        while (cur.next!=null){
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
