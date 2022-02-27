package com.gj.Exercise_6;

public class Exercise_10 {
    public ListNode detectCycle(ListNode head) {
        if (head==null) return head;
        ListNode fast = head;
        ListNode low = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            low = low.next;
            if (fast==low) break;
        }
        if (fast==null || fast.next==null) return null;

        fast = head;
        while (fast!=low){
            fast = fast.next;
            low = low.next;
        }
        return fast;

    }
}
