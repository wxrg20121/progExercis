package com.gj2.exercise_2;

public class Exercise_18 {
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if (head==null || head.next==null){
            return head;
        }
        ListNode phead = new ListNode(0);
        phead.next = head;
        ListNode pre = phead,cur = head;
        while (cur!=null && cur.next!=null){
            if (cur.next!=null && cur.val!=cur.next.val){
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
