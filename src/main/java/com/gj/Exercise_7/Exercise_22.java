package com.gj.Exercise_7;

public class Exercise_22 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null || pHead2==null) return null;
        int len1 = getlen(pHead1);
        int len2 = getlen(pHead2);
        while (len1!=len2){
            if (len1>len2){
                pHead1 = pHead1.next;
                len1--;
            }else {
                pHead2 = pHead2.next;
                len2--;
            }
        }
        while (pHead1!=pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }
    public int getlen(ListNode head){
        if (head==null) return 0;
        int count = 0;
        while (head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
}
