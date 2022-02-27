package com.gj.Exercise_7;

public class Exercise_68 {
    public void reorderList(ListNode head) {
        if (head==null || head.next==null){
            return;
        }
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
    public ListNode reverse(ListNode head){
        if (head==null) return head;
        ListNode pre = null;
        while (head!=null){
            ListNode node = head.next;
            head.next = pre;
            pre = head;
            head = node;
        }
        return pre;
    }
}
