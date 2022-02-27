package com.gj.exercise_2;

/**
 *
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 */

public class exercise_14 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        ListNode pHead2 = pHead;
        if (k==0){
            return null;
        }
        if (pHead==null){
            return pHead;
        }

        for (int i=0;i<k;i++){
            if (pHead2==null){
                return pHead2;
            }
            pHead2 = pHead2.next;

        }
        while (pHead2!=null){
            pHead=pHead.next;
            pHead2=pHead2.next;
        }
        return pHead;
    }
}
