package com.gj.exercise_9.exercise_12;

class ListNode{
    int val;
    ListNode next = null;
    public ListNode(int val){
        this.val = val;
    }
}

public class Exercise_1 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(67);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(24);
        ListNode listNode4 = new ListNode(54);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode listNode = ReverseList_1(listNode1);
        System.out.println(listNode.val);
//        System.out.println(printListFromTailToHead(listNode1));

    }

    public static ListNode ReverseList(ListNode head) {
        if (head==null || head.next==null)
            return head;
        ListNode pre = head;
        while (head.next!=null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        head.next = pre;
        return head;
    }

    public static ListNode ReverseList_1(ListNode head) {
        if (head==null)
            return head;
        ListNode pre = null;
        while (head!=null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }


}
