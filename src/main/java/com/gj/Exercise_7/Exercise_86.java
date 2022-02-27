package com.gj.Exercise_7;

public class Exercise_86 {
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
