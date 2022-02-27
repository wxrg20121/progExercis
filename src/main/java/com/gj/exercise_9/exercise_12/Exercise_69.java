package com.gj.exercise_9.exercise_12;

public class Exercise_69 {
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if (head==null || head.next==null) return head;
        ListNode cur = head;
        while (cur!=null && cur.next!=null){
            while (cur.next!=null && cur.val==cur.next.val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }

}
