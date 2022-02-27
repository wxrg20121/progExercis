package com.gj.Exercise_6;

public class Exercise_44 {
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        ListNode phead = new ListNode(0);
        phead.next = head;
        ListNode pre = phead,cur = head;
        while (cur!=null && cur.next!=null){
            if (cur.val!=cur.next.val){
                pre = cur;
            }else {
                while (cur.next!=null && cur.val==cur.next.val){
                    cur = cur.next;
                }
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return phead.next;
    }
}
