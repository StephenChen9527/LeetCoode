package com.nullbugs.easy;

import com.nullbugs.util.ListNode;

import java.util.List;

/**
 * 返回中间节点 双节点， 一个 一步， 一个步骤
 */
public class Exam876 {

    public static ListNode middleNode(ListNode head) {
        ListNode one=head;
        ListNode two=head;
        int len=1;
        while (two!=null){
            if(len%2==0){
                one=one.next;
            }
            two=two.next;
            len++;
        }

        return one;

    }

    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5};
        ListNode listNode = middleNode(arr2ListNode(arr));
        System.out.println(listNode.val);
    }

    public static ListNode arr2ListNode(int[] arr){
        ListNode head=new ListNode(arr[0]);

        ListNode current=head;
        for (int i = 1; i < arr.length; i++) {
            current.next=new ListNode(arr[i]);
            current=current.next;

        }
        return head;

    }

}
