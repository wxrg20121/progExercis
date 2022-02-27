package com.gj.exercise_5;

public class Exercise_15 {
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        if (head1==null){
            return head2;
        }
        if (head2==null){
            return head1;
        }
        int carray = 0;
        head1 = reverse(head1);
        head2 = reverse(head2);
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (head1!=null || head2!=null || carray!=0){
            if (head1!=null){
                carray += head1.val;
                head1 = head1.next;
            }

            if (head2!=null){
                carray += head2.val;
                head2 = head2.next;
            }
            p.next = new ListNode(carray%10);
            p = p.next;
            carray /= 10;
        }
        return reverse(head.next);
    }

    public ListNode reverse(ListNode phead){
        if (phead==null){
            return phead;
        }
        ListNode pre = null;
        while (phead!=null){
            ListNode node = phead.next;
            phead.next = pre;
            pre = phead;
            phead = node;
        }
        phead.next = pre;
        return phead;
    }
}
