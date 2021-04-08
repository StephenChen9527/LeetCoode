package com.newcoder;


import com.nullbugs.util.ListNode;
import com.utils.ListNodeUtils;

import java.util.List;

/**
 * 输入一个链表，反转链表后，输出新链表的表头
 */
public class NC78 {

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtils.productList(1, 2, 3, 4, 5, 6, 7);

        ListNodeUtils.listNodePrint(ReverseList(listNode));
    }

    public static ListNode ReverseList(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode prev = head;
        ListNode next = head.next;
        prev.next =null;
        while (next !=null && next.next!=null){
            ListNode cur = next;
            next = next.next;
            cur.next = prev;
            prev = cur ;

        }
        next.next = prev;
        return next;
    }
}
