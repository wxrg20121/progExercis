package com.gj.exercise_1;

public class Exercise_73 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here

        if (pHead==null || k<=0) return null;

        ListNode p1 = pHead,p2=pHead;
        for (int i = 1; i < k; i++) {
            p1 = p1.next;
            if (p1==null){
                return null;
            }
        }
        while (p1.next!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;

    }
}
