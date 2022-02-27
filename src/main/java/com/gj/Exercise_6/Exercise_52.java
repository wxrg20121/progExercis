package com.gj.Exercise_6;

public class Exercise_52 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode fast = head,slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode after = slow.next;
        slow.next = null;
        after = reverse(after);
        fast = head;
        while (fast!=null && after!=null){
            ListNode node1 = fast.next;
            ListNode node2 = after.next;
            fast.next = after;
            fast = node1;
            after.next = fast;
            after = node2;
        }

    }

    public ListNode reverse(ListNode phead){
        if (phead==null) return phead;
        ListNode pre = null;
        while (phead!=null){
            ListNode node = phead.next;
            phead.next = pre;
            pre = phead;
            phead = node;
        }
        return pre;
    }

}
