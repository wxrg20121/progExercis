package com.gj.Exercise_8;

public class Exercise_12 {
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        if (head1==null) return head2;
        if (head2==null) return head1;

        ListNode phead = new ListNode(0);
        ListNode p = phead;
        int carray = 0;
        head1 = reverse(head1);
        head2 = reverse(head2);
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
            carray/=10;
            p=p.next;
        }
        return reverse(phead.next);

    }

    public ListNode reverse(ListNode head){
        if (head==null) return head;
        ListNode pre = null;
        while (head!=null){
            ListNode node = head.next;
            head.next = pre;
            pre = head;
            head = node;
        }
        return pre;
    }
}
