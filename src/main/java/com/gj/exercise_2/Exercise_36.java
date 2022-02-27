package com.gj.exercise_2;

/**
 *
 * 输入两个链表，找出它们的第一个公共结点。
 * （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 *
 */

public class Exercise_36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null || pHead2==null){
            return null;
        }
        int len1 = getLen(pHead1);
        int len2 = getLen(pHead2);
        int i = len1 - len2;
        while (len1!=len2){
            if (len1>len2){
                len1--;
                pHead1 = pHead1.next;
            }
            if (len1<len2){
                pHead2 = pHead2.next;
                len2--;
            }
        }
        while (pHead1!=pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }

    public int getLen(ListNode phead){
        int len = 0;
        while (phead!=null){
            phead = phead.next;
            len++;
        }
        return len;
    }


    public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
        int len1 = getLength(pHead1);
        int len2 = getLength(pHead2);

        if (len1>len2){
            pHead1 = getNode(pHead1,len1-len2);
        }else {
            pHead2 = getNode(pHead2,len2-len1);
        }

        while (pHead1!=null){
            if (pHead1==pHead2) return pHead1;
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }

        return null;
    }

    public int getLength(ListNode pHead1){
        int len = 0;
        ListNode current = pHead1;
        if (current==null) return 0;
        while (current!=null){
            current = current.next;
            len++;
        }
        return len;
    }

    public ListNode getNode(ListNode pHead1, int cnt){
        if (cnt==0) return pHead1;

        while (cnt>0){
            pHead1 = pHead1.next;
            cnt--;
        }

        return pHead1;
    }
}
