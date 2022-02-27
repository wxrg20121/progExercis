package com.gj.exercise_1;

import java.util.ArrayList;

/*
    输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
    {67,0,24,58}
    [58,24,0,67]
*/

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}



public class Exercise_3 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(67);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(24);
        ListNode listNode4 = new ListNode(54);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode listNode = reverse_7(listNode1);
        System.out.println(listNode.val);
//        System.out.println(printListFromTailToHead(listNode1));

    }




    public static ListNode reverse_6(ListNode hnode){
        if (hnode==null){
            return hnode;
        }

        ListNode pre = null;
        ListNode next = null;
        while (hnode.next != null){
            next = hnode.next;
            hnode.next = pre;
            pre = hnode;
            hnode = next;
        }
        hnode.next = pre;
        return hnode;
    }

    public static ListNode reverse_7(ListNode hnode){
        if (hnode.next==null){
            return hnode;
        }
        ListNode node = reverse_7(hnode.next);
        hnode.next.next = hnode;
        hnode.next = null;
        return node;
    }







    public static ListNode reverse(ListNode listNode){
        if (listNode==null || listNode.next==null){
            return listNode;
        }

        ListNode pre = null;
        ListNode next = null;

        while (listNode.next!=null){
            next = listNode.next;
            listNode.next = pre;
            pre = listNode;
            listNode = next;

        }
        listNode.next = pre;
        return listNode;
    }




    public static ListNode reverse_2(ListNode listNode){
        if (listNode.next==null){
            return listNode;
        }
        ListNode node = reverse_2(listNode.next);
        listNode.next.next = listNode;
        listNode.next = null;
        return node;
    }

    public static ListNode reverse_3(ListNode listNode,int n){
        ListNode sec = null;
        if (n==1){
            sec = listNode.next;
            return listNode;
        }

        ListNode last = reverse_3(listNode.next,n-1);
        listNode.next.next = listNode;
        listNode.next = sec;
        return last;

    }



















    public static ListNode reverse_4(ListNode head){
        if (head==null || head.next==null){
            return head;
        }

        ListNode pre = null;
        ListNode next = null;
        while (head.next!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        head.next = pre;

        return head;
    }

    public static ListNode reverse_5(ListNode head){
        if (head.next==null){
            return head;
        }

        ListNode last = reverse_5(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }




    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (listNode==null){
            return arrayList;
        }
        listNode = reverse(listNode);
        while (listNode!=null){
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }

        return arrayList;
    }


}

