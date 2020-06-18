package com.nullbugs.easy;


import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Exam1365 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{})));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer,String>  map =new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],"")+i+"_");
        }
        int x = 0;
        for (Integer i : map.keySet()) {
            String s = map.get(i);
            String[] s1 = s.split("_");
            for (int j = 0; j < s1.length; j++) {
                nums[Integer.valueOf(s1[j])]=x;
            }
            x+=s1.length;
        }
        return nums;
    }
}
