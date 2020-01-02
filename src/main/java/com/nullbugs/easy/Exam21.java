package com.nullbugs.easy;

import com.nullbugs.util.ListNode;

import java.util.List;

public class Exam21 {

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode list=head;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                list.next=new ListNode(l1.val);
                l1=l1.next;
            }else{
                list.next=new ListNode(l2.val);
                l2=l2.next;
            }
            list=list.next;
        }
        if(l1!=null){
            list.next=l1;
        }
        if(l2!=null){
            list.next=l2;
        }
        return head;
    }
}
