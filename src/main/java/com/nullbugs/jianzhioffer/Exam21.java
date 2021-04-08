package com.nullbugs.jianzhioffer;

import java.util.Arrays;

public class Exam21 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(exchange(1,2,3,4)));
    }
    public static int[] exchange(int... nums) {
        if(nums==null){
            return  nums;
        }
        int start = 0;
        int end = nums.length-1;
        while (start <= end ) {
            while ( start<nums.length && ((nums[start]&1 ) == 1)){
                start++;
            }
            while ( end>-1 && ((nums[end]&1 ) != 1) ){
                end--;
            }
            if( start<=end  && (nums[start]&1 ) != 1 && (nums[end]&1 ) == 1){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }

        }

        return nums;
    }


}
