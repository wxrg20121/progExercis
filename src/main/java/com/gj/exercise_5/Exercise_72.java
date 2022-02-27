package com.gj.exercise_5;

public class Exercise_72 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if (pHead==null || k<=0) return null;

        ListNode cur = pHead;

        for (int i = 1; i < k; i++) {
            cur = cur.next;
            if (cur==null) return null;
        }
        while (cur.next!=null){
            pHead = pHead.next;
            cur = cur.next;
        }
        return pHead;
    }
}
