package com.gj2.exercise_4;

public class Exercise_11 {
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if (head==null || head.next==null) return head;
        ListNode cur = head;
        while (cur!=null && cur.next!=null){
            if (cur.val==cur.next.val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}
