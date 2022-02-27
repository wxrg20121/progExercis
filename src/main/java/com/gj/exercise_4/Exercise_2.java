package com.gj.exercise_4;

public class Exercise_2 {
    public boolean hasCycle(ListNode head) {
        if (head==null || head.next==null){
            return false;
        }
        ListNode fast = head;
        ListNode low = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            low = low.next;
            if (fast==low){
                return true;
            }
        }

        return false;
    }
}
