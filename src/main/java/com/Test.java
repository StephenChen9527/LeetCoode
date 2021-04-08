package com;

import com.nullbugs.util.ListNode;
import com.utils.ListNodeUtils;

public class Test {


    public static void main(String[] args) {
        ListNode listNode = ListNodeUtils.productList(1,2,3,4,5,6);
        ListNodeUtils.listNodePrint( resve(listNode));
    }

    public static ListNode resve(ListNode head){

        if(head == null || head.next == null){
            return head;
        }
        ListNode node = new ListNode();
        node.next = head.next;


        ListNode cur = head;
        ListNode next = head.next;
        ListNode prev = node;
        while(cur != null && next != null){
            ListNode temp = next.next;
            next.next = cur;
            cur.next = temp;

            prev.next = next ;

            if(temp==null){
                break;
            }
            prev = cur;
            cur = temp;
            next = cur.next;

        }



        return node.next;

    }

}
