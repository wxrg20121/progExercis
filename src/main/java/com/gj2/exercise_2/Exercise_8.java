package com.gj2.exercise_2;

public class Exercise_8 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead==null || pHead.next==null) return null;
        ListNode fast=pHead,slow=pHead;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow) break;
        }
        if (fast==null || fast.next==null) return null;
        fast = pHead;
        while (fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
