package com.gj.exercise_9;

public class Exercise_80 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if (pHead==null || k<=0) return null;
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
