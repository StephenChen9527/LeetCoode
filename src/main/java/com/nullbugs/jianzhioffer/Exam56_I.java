package com.nullbugs.jianzhioffer;

public class Exam56_I {
    public static void main(String[] args) {
        int[] arr = new int[]{4,1,4,6,1,8};
        singleNumbers(arr);
    }

    public static int[] singleNumbers(int[] nums) {
        int arr[] = new int[2];
        int x =0 ;
        for (int i = 0; i < nums.length; i++) {
            x=x^nums[i];
        }
        System.out.println(x);

        return arr;
    }

}
