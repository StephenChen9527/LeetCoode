package com.nullbugs.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exam1122 {


    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<String,Integer> map=new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            map.put(String.valueOf(arr1[i]),map.getOrDefault(String.valueOf(arr1[i]),0));
        }

        int index=0;
        for (int i = 0; i < arr2.length; i++) {
            Arrays.fill(arr1,index,map.get(String.valueOf(arr2[i])),arr2[i]);
            index+=map.get(String.valueOf(arr2[i]));
            map.remove(String.valueOf(arr2[i]));
        }
        Iterator<String> it = map.keySet().iterator();

        return arr1;
    }
}
