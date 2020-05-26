package com.nullbugs.medium;

public class Exam287 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,7};
        findDuplicate(arr);
    }

    public static int findDuplicate(int[] nums) {
        int x = 1 ;
        for (int i = 0; i < nums.length; i++) {
            x = x^nums[i];
        }
        System.out.println(x);
        return x;
    }   
}
