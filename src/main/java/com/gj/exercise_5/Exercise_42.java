package com.gj.exercise_5;

public class Exercise_42 {
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        ListNode phead = new ListNode(0);
        phead.next = head;
        ListNode preStart = phead;
        ListNode start = head;

        for (int i = 1; i < m; i++) {
            preStart = start;
            start = start.next;
        }
        for (int i = 0; i < n-m; i++) {
            ListNode temp = start.next;
            start.next = temp.next;
            temp.next = preStart.next;
            preStart.next = temp;
        }
        return phead.next;
    }

}
