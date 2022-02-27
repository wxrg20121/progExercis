package com.gj.exercise_9.exercise_12;

public class Exercise_15 {
    public boolean hasCycle(ListNode head) {
        if (head==null || head.next==null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow) return true;
        }
        return false;
    }
}
