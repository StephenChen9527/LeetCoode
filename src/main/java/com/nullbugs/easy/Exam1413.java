package com.nullbugs.easy;

public class Exam1413 {
    public static void main(String[] args) {
        minStartValue(new int[]{-3,2,-3,4,2});
    }
    public static int minStartValue(int[] nums) {
        int startValue = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum<=0){
                startValue = Math.min(startValue,sum);
            }
        }
        return startValue>0?1:Math.abs(startValue)+1;

    }

}
