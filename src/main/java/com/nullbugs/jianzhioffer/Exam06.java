package com.nullbugs.jianzhioffer;

import com.nullbugs.util.ListNode;
import com.utils.ListNodeUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam06 {

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtils.productList(1,2,3,4,5,6);
        System.out.println(Arrays.toString(reversePrint(listNode)));
    }

    public static int[] reversePrint(ListNode head) {
        if(head==null){
            return null;
        }
        int len = 0;
        ListNode node = head;
        while (node !=null){
            node = node.next;
            len++;
        }
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length-1-i] = head.val;
            head = head.next;
        }
        return arr;
    }

}
