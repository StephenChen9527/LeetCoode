package com.nullbugs.easy;


import java.util.*;

public class Exam349 {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        intersection(nums1,nums2);

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set result=new HashSet();

        Set nums=new HashSet();

        for (int i = 0; i < nums1.length; i++) {
            nums.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
           if(nums.contains(nums2[i])) {
               result.add(nums2[i]);
            }
        }
        result.size();
        return null;


    }
}
