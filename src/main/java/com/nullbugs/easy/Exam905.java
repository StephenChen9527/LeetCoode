package com.nullbugs.easy;

import java.util.Arrays;

public class Exam905 {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3,1,2,4})));;
    }

    public static int[] sortArrayByParity(int[] A) {
        int a=0;
        int d=A.length-1;
        int[] arr=new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if((A[i]&1)==1){
                arr[d--]=A[i];
            }else{
                arr[a++]=A[i];
            }
        }
        return arr;
    }
}
