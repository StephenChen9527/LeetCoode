package com.nullbugs.jianzhioffer;

import java.util.Arrays;

public class Exam39 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }


}
