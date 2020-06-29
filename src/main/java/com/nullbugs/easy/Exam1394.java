package com.nullbugs.easy;

import java.util.HashMap;
import java.util.Map;

public class Exam1394 {

    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int result = -1;
        for (Integer i : map.keySet()) {
            if(i==map.get(i)){
                result = Math.max(result,i);
            }
        }
        return result;
    }
}
