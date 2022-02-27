package com.gj.exercise_5;

public class Exercise_10 {

    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        if (head==null || head.next==null || k<=1){
            return head;
        }
        ListNode cur = head;
        for (int count = 1; count < k; count++) {
            cur = cur.next;
            if (cur==null){
                return head;
            }
        }
        ListNode next = cur.next;
        reverse(head,cur);
        head.next = reverseKGroup(next,k);
        return cur;
    }

    public ListNode reverse(ListNode head,ListNode tail){
        if (head==null){
            return head;
        }
        ListNode pre = head;
        while (head!=tail){
            ListNode node = head.next;
            head.next = pre;
            pre = head;
            head = node;
        }
        head.next = pre;
        return head;
    }

}
