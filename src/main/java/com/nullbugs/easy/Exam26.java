package com.nullbugs.easy;

public class Exam26 {

    public int removeDuplicates(int[] nums) {
        if(nums== null || nums.length==0){
            return 0;
        }
        int count = 1 ;
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=cur){
                nums[count++] = nums[i];
                cur = nums[i];
            }
        }
        return count;
    }
}
