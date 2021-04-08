package com.nullbugs.jianzhioffer;

import com.nullbugs.util.ListNode;
import com.utils.ListNodeUtils;

public class Exam24 {

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtils.productList(1);
        ListNodeUtils.listNodePrint(reverseList(listNode));
    }


    public static ListNode reverseList(ListNode head) {
        if(head == null ){
            return head;
        }

        ListNode cur = head;
        ListNode next = head.next;
        cur.next = null;
        while (next !=null){
            ListNode temp = next.next;
            next.next = cur;
            cur = next;
            next = temp;
        }
        return cur;

    }
}
