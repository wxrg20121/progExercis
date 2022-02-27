package com.gj.Exercise_6;

public class Exercise_7 {
    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        if (head==null || head.next==null || k<=1){
            return head;
        }

        ListNode cur = head;
        for (int i = 1; i < k; i++) {
            cur = cur.next;
            if (cur==null) return head;
        }
        ListNode node = cur.next;
        reverse(head,cur);
        head.next = reverseKGroup(node,k);
        return cur;
    }

    public ListNode reverse(ListNode head1,ListNode head2){
        if (head1==null || head1.next==null) return head1;
        ListNode pre = null;
        while (head1!=head2){
            ListNode node = head1.next;
            head1.next = pre;
            pre = head1;
            head1 = node;
        }
        head1.next = pre;
        return head1;
    }


}
