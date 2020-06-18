package com.nullbugs.easy;

import com.nullbugs.util.ListNode;

public class Exam1290 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next=new ListNode(0);
        head.next.next=new ListNode(1);
        getDecimalValue(head);
    }

    public static int getDecimalValue(ListNode head) {
        int count = 0;
        while (head!=null){
            count=count<<1;
            count += head.val;
            head = head.next;
        }
        return count;
    }

}
