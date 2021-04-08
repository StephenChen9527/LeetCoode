package com.newcoder;

import com.nullbugs.util.ListNode;
import com.utils.ListNodeUtils;

import java.util.List;

public class NC53 {

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtils.productList(1, 2, 3, 4, 5,6,7,8,9,10);
        ListNodeUtils.listNodePrint(removeNthFromEnd(listNode,1));
    }

    //给出的链表为:1->2->3->4->5, n= 2.
    //删除了链表的倒数第n个节点之后,链表变为1->2->3->5.
    public static ListNode removeNthFromEnd (ListNode head, int n) {
        if(head ==null){
            return head;
        }
        ListNode one = head;
        ListNode two = head;
        while (n>0){
            one = one.next;
            n--;
        }
        if(one == null){
            return head.next;
        }
        while (one.next!=null){
            one = one. next;
            two = two.next;
        }

        two.next = two.next.next;
        return head;

    }

    public static ListNode removeNthFromEnd2 (ListNode head, int n) {
        ListNode node = new ListNode(0);



        return node.next;
    }

}
