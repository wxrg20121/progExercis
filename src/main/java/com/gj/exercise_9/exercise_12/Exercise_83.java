package com.gj.exercise_9.exercise_12;

public class Exercise_83 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        if (pHead==null || k<=0) return pHead;
        ListNode cur = pHead;
        for (int i = 1; i < k; i++) {
            cur = cur.next;
            if (cur==null) return null;
        }
        while (cur.next!=null){
            cur = cur.next;
            pHead = pHead.next;
        }
        return pHead;
    }
}
