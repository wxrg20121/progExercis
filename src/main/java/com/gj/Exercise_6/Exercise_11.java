package com.gj.Exercise_6;

public class Exercise_11 {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if (head==null) return head;
        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        if (first==null) return head.next;
        while (first.next!=null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;

    }
}
