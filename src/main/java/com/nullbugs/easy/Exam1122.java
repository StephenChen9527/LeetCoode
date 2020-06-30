package com.nullbugs.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exam1122 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},new int[]{2,1,4,3,9,6})));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            Arrays.fill(arr1,index,index+map.get(arr2[i])+1,arr2[i]);
            index+=map.get(arr2[i]);
        }
        return arr1;
    }
}
