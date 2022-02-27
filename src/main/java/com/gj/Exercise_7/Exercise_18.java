package com.gj.Exercise_7;

public class Exercise_18 {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if (head==null) return head;
        ListNode fast = head,slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast==null) return head.next;
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
