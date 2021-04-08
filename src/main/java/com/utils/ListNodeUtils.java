package com.utils;

import com.nullbugs.util.ListNode;

import java.util.HashMap;

public class ListNodeUtils {

    public static void listNodePrint(ListNode head){
        if(head == null){

            return;
        }
        while (head.next!=null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println(head.val);
    }

    public static ListNode productList(int... values){
        if(values==null || values.length == 0){
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current =head;
        for (int i = 1; i < values.length; i++) {
            ListNode node = new ListNode(values[i]);
            current.next = node;
            current=node;
        }
        return head;
    }
}
