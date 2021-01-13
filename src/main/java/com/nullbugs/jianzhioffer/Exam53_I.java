package com.nullbugs.jianzhioffer;

public class Exam53_I {


    public int search(int[] nums, int target) {
        int sum = 0;
        if(nums==null || nums.length==0 || nums[0] >target || nums[nums.length-1]<target){
            return sum;
        }
        for (int i = 0; i < nums.length; i++) {
            if(target==nums[i]){
                sum++;
            }else if(target<nums[i]){
                break;
            }
        }

        return sum;
    }


}
