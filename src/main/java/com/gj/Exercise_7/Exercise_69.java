package com.gj.Exercise_7;

public class Exercise_69 {
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if (head==null||head.next==null) return head;
        ListNode phead = new ListNode(0);
        phead.next = head;
        ListNode pre = phead, cur = head;
        while (cur!=null && cur.next!=null){
            if (cur.next!=null && cur.val!=cur.next.val){
                pre = cur;
            }else {
                while (cur.next!=null && cur.val==cur.next.val){
                    cur = cur.next;
                }
                pre.next = cur;
            }
            cur = cur.next;
        }
        return phead.next;
    }
    public ListNode deleteDuplicates2 (ListNode head) {
        // write code here
        if (head==null||head.next==null) return head;
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
