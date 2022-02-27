package com.gj.exercise_5;

public class Exercise_53 {
    public ListNode oddEvenList (ListNode head) {
        // write code here
        if (head==null||head.next==null){
            return head;
        }
        ListNode odd = head;
        ListNode peven = head.next;
        ListNode even = peven;
        while (even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = peven;
        return head;

    }
}
