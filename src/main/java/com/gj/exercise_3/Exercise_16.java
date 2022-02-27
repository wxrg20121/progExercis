package com.gj.exercise_3;

public class Exercise_16 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1==null){
            return list2;
        }
        if (list2==null){
            return list1;
        }
        ListNode head = null;
        ListNode p = null;

        if (list1.val<list2.val){
            head = list1;
            list1 = list1.next;
        }else {
            head = list2;
            list2 = list2.next;
        }

        p = head;
        while (list1!=null && list2!=null){
            if (list1.val<list2.val){
                p.next = list1;
                list1 = list1.next;
                p = p.next;
            }else {
                p.next = list2;
                list2 = list2.next;
                p = p.next;
            }
        }

        while (list1!=null){
            p.next = list1;
            list1 = list1.next;
            p = p.next;
        }

        while (list2!=null){
            p.next = list2;
            list2 = list2.next;
            p = p.next;
        }
        return head;
    }

}
