package com.gj.exercise_5;

public class Exercise_13 {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if (head==null){
            return head;
        }
        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i < n; i++) {
            if (first==null){
                return null;
            }
            first = first.next;
        }
        while (first!=null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;
    }
}
