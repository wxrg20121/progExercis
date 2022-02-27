package com.gj.Exercise_6;

import java.util.ArrayList;

public class Exercise_24 {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists==null || lists.size()==0) return null;
        ListNode head = lists.get(0);
        for (int i = 1; i < lists.size(); i++) {
            head = merge2Lists(head,lists.get(i));
        }
        return head;
    }

    public ListNode merge2Lists(ListNode head1,ListNode head2){
        ListNode phead = new ListNode(0);
        ListNode p = phead;
        while (head1!=null && head2!=null){
            if (head1.val<head2.val){
                p.next = head1;
                head1 = head1.next;
            }else {
                p.next = head2;
                head2 = head2.next;
            }
            p = p.next;
        }
        p.next = (head1==null) ? head2 : head1;
        return phead.next;
    }
}
