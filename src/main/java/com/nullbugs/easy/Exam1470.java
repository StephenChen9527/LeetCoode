package com.nullbugs.easy;

public class Exam1470 {


    public int[] shuffle(int[] nums, int n) {
        if(nums == null){
            return null;
        }
        int[] arr = new int[nums.length];
        int x = 0;
        for (int i = 0; i < arr.length; i+=2) {
            arr[i]=nums[x++];
            arr[i+1]=nums[n++];
        }
        return arr;
    }

}
