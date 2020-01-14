package com.nullbugs.easy;

public class Exam303 {

    private int[] nums;

    public Exam303(int[] nums) {
        this.nums=nums;
        for (int i = 1; i < nums.length; i++) {
            nums[i]=nums[i]+nums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        if(i==0){
            return nums[j];
        }
        return nums[j]-nums[i-1];
    }
}
