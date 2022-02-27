package com.gj.Exercise_6;

public class Exercise_37 {
    public boolean isPail (ListNode head) {
        // write code here
        if (head==null || head.next==null) return true;

        ListNode fast = head,slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode slow2 = reverse(slow);
        while (slow2!=null){
            if (head.val!=slow2.val){
                return false;
            }
            slow2 = slow2.next;
            head = head.next;
        }
        return true;
    }

    public ListNode reverse(ListNode root){
        if (root==null) return root;
        ListNode pre = null;
        while (root!=null){
            ListNode node = root.next;
            root.next = pre;
            pre = root;
            root = node;
        }
        return pre;
    }

}
