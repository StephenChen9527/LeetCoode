package com.nullbugs.easy;

import java.util.Arrays;

public class Exam1304 {

    public static void main(String[] args) {
        int[] ints = sumZero(5);
        System.out.println(Arrays.toString(ints));
    }
    //1  0
    //2  1  -1
    // 3  0  1  -1
    //4   1  -1  2  -2
    public static int[] sumZero(int n) {
        int max=n/2;
        int[] arr=new int[n];
        int i=0;
        while (max>0){
            arr[i]=max;
            arr[n-i-1]=-max;
            i++;
            max--;
        }
        return arr;
    }
}
