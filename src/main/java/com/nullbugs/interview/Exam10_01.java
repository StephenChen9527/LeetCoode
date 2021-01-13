package com.nullbugs.interview;

import java.util.Arrays;

/**
 * 合并排序的数组
 */
public class Exam10_01 {


    //给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。

    public static void main(String[] args) {
        int[] A= new int[]{1,2,3,0,0,0};
        int[] B= new int[]{2,5,6};
        merge(A,3,B,3);
        System.out.println(Arrays.toString(A));
    }
    public static void merge(int[] A, int m, int[] B, int n) {
        if(A==null || B==null){
            return;
        }
        int indexA = m-1,indexB = n-1;
        int lastIndex = A.length-1;
        while (lastIndex>=0){
            if(indexA==-1){
                A[lastIndex--]=B[indexB--];
            }else if(indexB==-1){
                A[lastIndex--]=A[indexA--];
            }else if(A[indexA]>B[indexB]){
                A[lastIndex--]=A[indexA--];
            }else{
                A[lastIndex--]=B[indexB--];
            }
        }
    }

}
