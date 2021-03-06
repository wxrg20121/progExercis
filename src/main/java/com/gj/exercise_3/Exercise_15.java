package com.gj.exercise_3;

/**
 *
 * 输入一个链表，反转链表后，输出新链表的表头。
 */

public class Exercise_15 {
    public ListNode ReverseList(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode node = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
