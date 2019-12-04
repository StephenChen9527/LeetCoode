package com.nullbugs.easy;

import com.nullbugs.util.ListNode;

import java.util.List;

/**
 * 返回中间节点 双节点， 一个 一步， 一个步骤
 */
public class Exam876 {

    public static ListNode middleNode(ListNode head) {
        ListNode first=head.next;
        ListNode sec=head.next;
        int count=0;
        while(sec!=null){
            sec=sec.next;
            count++;
            //奇数次
            if((count&1)!=1){
                first=first.next;
            }

        }
        count--;
        if((count&1)!=1){
            first=first.next;
        }
        return first;

    }

    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5};
        ListNode listNode = middleNode(arr2ListNode(arr));
        System.out.println(listNode.val);
    }

    public static ListNode arr2ListNode(int[] arr){
        ListNode head=new ListNode(arr[0]);

        ListNode current=head;
        for (int i = 0; i < arr.length; i++) {
            current.next=new ListNode(arr[i]);
            current=current.next;

        }
        return head;

    }

}
