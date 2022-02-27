package com.gj.exercise_9.exercise_12;

public class Exercise_62 {
    public ListNode oddEvenList (ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode odd = head, peven = head.next, even = peven;
        while (even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next=odd.next;
            even = even.next;
        }
        odd.next = peven;
        return head;
    }
}
