package com.gj.exercise_3;

/**
 *
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 如果该链表长度小于k，请返回空。
 *
 */

public class Exercise_14 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if (pHead==null){
            return null;
        }

        ListNode node = pHead;
        for (int i = 0; i < k; i++) {
            if (node==null)return null;
            node = node.next;
        }

        while (node!=null){
            pHead = pHead.next;
            node = node.next;
        }
        return pHead;

    }
}
