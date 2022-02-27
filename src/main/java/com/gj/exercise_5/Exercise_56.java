package com.gj.exercise_5;

public class Exercise_56 {
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        if (head1==null) return head2;
        if (head2==null) return head1;
        int carray = 0;
        ListNode phead = new ListNode(0);
        ListNode p = phead;
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
            p=p.next;
            carray/=10;
        }
        return reverse(phead.next);
    }

    public ListNode reverse(ListNode root){
        if (root==null){
            return root;
        }
        ListNode pre = null;
        while (root!=null){
            ListNode node = root.next;
            root.next = pre;
            pre = root;
            root = node;
        }
        return pre;
    }

}
