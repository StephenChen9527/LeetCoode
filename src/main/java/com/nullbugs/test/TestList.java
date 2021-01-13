package com.nullbugs.test;


import com.nullbugs.util.ListNode;

import java.util.List;

public class TestList {

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode temp = head;

        for (int i = 1; i < 10; i++) {
            temp.next=new ListNode(i);
            temp = temp.next;
        }

        ListNode fanzhuan = fanzhuan(head);
        while (fanzhuan!=null){
            System.out.print(fanzhuan.val+"->");
            fanzhuan= fanzhuan.next;
        }


    }


    public static ListNode fanzhuan(ListNode head){
        if(head == null){
            return null;
        }
        ListNode pre = head;
        ListNode curre = head.next;
        pre.next = null;
        while (curre != null){
            ListNode next = curre.next;
            curre.next = pre;
            pre = curre;
            curre = next;
        }

        return pre;

    }
}
