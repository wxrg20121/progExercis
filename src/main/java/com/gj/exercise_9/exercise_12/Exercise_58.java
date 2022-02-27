package com.gj.exercise_9.exercise_12;

public class Exercise_58 {
    public ListNode deleteDuplicates (ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode phead = new ListNode(0);
        phead.next = head;
        ListNode pre = phead, cur = head;
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
