package com.gj.Exercise_6;

class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}

public class Exercise_5 {
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here

        if (l1==null) return l2;
        if (l2==null) return l1;
        ListNode phead = new ListNode(0);
        ListNode p = phead;
        if (l1.val>l2.val){
            p.next = l2;
            l2 = l2.next;
        }else {
            p.next = l1;
            l1 = l1.next;
        }
        p = p.next;
        while (l1!=null && l2!=null){
            if (l1.val<l2.val){
                p.next = l1;
                l1 = l1.next;
            }else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1!=null){
            p.next = l1;
        }
        if (l2!=null){
            p.next = l2;
        }
        return phead.next;
    }
}
