package com.gj.exercise_1;

/**
 *
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 *
 */

public class Exercise_55 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead==null){
            return null;
        }
        ListNode fast = pHead;
        ListNode low = pHead;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            low = low.next;
            if (fast==low){
                break;
            }

        }
        if (fast==null || fast.next==null){
            return null;
        }
        fast = pHead;
        while (fast!=low){
            fast = fast.next;
            low = low.next;
        }
        return fast;
    }
}
