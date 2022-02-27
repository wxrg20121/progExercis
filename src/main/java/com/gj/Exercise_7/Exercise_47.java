package com.gj.Exercise_7;

public class Exercise_47 {
    public boolean isPail (ListNode head) {
        // write code here
        if (head==null || head.next==null) return false;
        ListNode fast = head,slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow);
        while (slow!=null){
            if (slow.val!=head.val) return false;
            slow = slow.next;
            head = head.next;
        }
        return true;
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
