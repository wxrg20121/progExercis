package com.gj.exercise_9.exercise_12;

public class Exercise_49 {
    public boolean isPail (ListNode head) {
        if (head==null || head.next==null) return true;
        ListNode fast = head,slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow);
        while (slow!=null){
            if (head.val!=slow.val) return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        if (head==null || head.next==null) return head;
        ListNode pre = null;
        while (head.next!=null){
            ListNode node = head.next;
            head.next = pre;
            pre = head;
            head = node;
        }
        head.next = pre;
        return head;
    }
}
