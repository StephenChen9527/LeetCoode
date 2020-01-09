package com.nullbugs.easy;

import java.util.*;

public class Exam1207 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,2,1,1,3};
        uniqueOccurrences(arr);
        //Set<Integer> set=new HashSet<>();
        //set.add(new Integer(9999));
        //set.add(new Integer(9999));
        //System.out.println(set.size());

    }

    public static boolean uniqueOccurrences(int[] arr) {
        if(arr==null || arr.length==0){
            return true;
        }
        Set<Integer> set=new HashSet<>();
        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(String.valueOf(arr[i]))){
                map.put(String.valueOf(arr[i]),map.get(String.valueOf(arr[i]))+1);
            }else{
                map.put(String.valueOf(arr[i]),1);
            }
        }
        set.addAll(map.values());
        System.out.println(set.size()==map.size());
        return set.size()==map.size();
    }
}
