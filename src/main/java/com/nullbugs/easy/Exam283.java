package com.nullbugs.easy;

import java.util.Arrays;

public class Exam283 {

    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        Arrays.sort(nums);
        int zeroIndex=nums.length-1;
        for (int i = 0; i < nums.length; ) {
            if(nums[i]==0){
                nums[zeroIndex]=nums[i]^nums[zeroIndex];
                nums[i]=nums[i]^nums[zeroIndex];
                nums[zeroIndex]=nums[i]^nums[zeroIndex];
                zeroIndex--;
            }
        }



    }

}
