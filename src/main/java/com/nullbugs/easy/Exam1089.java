package com.nullbugs.easy;

import sun.security.util.Length;

import java.util.Arrays;

public class Exam1089 {

    public static void main(String[] args) {

    }

    public static void duplicateZeros(int[] arr) {
        int[] src=Arrays.copyOfRange(arr,0,arr.length);
        for (int i=0,j=0;i<arr.length;i++,j++){
            if(src[j]!=0){
                arr[i]=src[j];
            }else{
                arr[i++]=0;
                if(i<arr.length){
                    arr[i]=0;
                }
            }
        }
    }
}
