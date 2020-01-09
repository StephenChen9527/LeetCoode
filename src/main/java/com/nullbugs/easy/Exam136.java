package com.nullbugs.easy;

public class Exam136 {

    public static void main(String[] args) {
        singleNumber(new int[]{4,1,2,1,2});
    }
    // 1 1 1
    // 1 1 1
    public static int singleNumber(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[0]^=nums[i];
        }
        System.out.println(nums[0]);
        return nums[0];
    }
}
