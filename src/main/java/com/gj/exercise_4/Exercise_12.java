package com.gj.exercise_4;

/**
 *
 *
 * 需求：
 *
 *     两个用链表代表的整数，其中每个节点包含一个数字。数字存储按照在原来整数中相反的顺序，使得第一个数字位于链表的开头。写出一个函数将两个整数相加，用链表形式返回和。
 *
 *     比如：给出两个链表 3->1->5->null 和 5->9->2->null，返回 8->0->8->null
 *
 * 思路：
 *
 *     遍历两个链表，其实就是遍历每个节点，当两个节点至少有一个不是null或者进位不是0的条件下，需要创建新的节点，每个新的节点的值为（进位+非空节点值）%10，进位数为（进位+非空节点值）/10。
 *     如果上述三个条件都不满足，那么说明两个节点都是null，并且进位是0，那么就不需要产生新的节点，直接返回初始节点即可。
 *
 * 难点：
 *
 *     1、创建返回连接节点result，不能直接对其进行操作，因为最后返回的时候会出错，所以需要另外一个节点代替它，使用p
 *
 *     2、因为每次创建新的节点都是上一节点的next，所以result节点实际上是没用的，所以返回的时候应该返回result.next
 * ————————————————
 * 版权声明：本文为CSDN博主「upupday19」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/upupday19/article/details/78379227
 *
 */

public class Exercise_12 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(9);
        ListNode listNode6 = new ListNode(2);
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode node = addLists(listNode1,listNode4);
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }

    }

    public static ListNode addLists(ListNode l1,ListNode l2){
        ListNode head = new ListNode(0);

        ListNode p = head;
        int carry = 0;
        while (l1!=null || l2!=null || carry!=0){
            if (l1!=null){
                carry += l1.val;
                l1 = l1.next;
            }

            if (l2!=null){
                carry += l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(carry%10);
            p.next = node;
            p = p.next;
            carry /=10;
        }
        return head.next;

    }
}
