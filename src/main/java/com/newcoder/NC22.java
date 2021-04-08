package com.newcoder;

import java.util.Arrays;

public class NC22 {

    public static void main(String[] args) {
        int[] A = new int[1];
        int[] B = new int[]{1};
        merge(A,0,B,1 );
        System.out.println(Arrays.toString(A));
    }

    public static void merge(int A[], int m, int B[], int n) {

        int index = A.length;
        while (m>0 && n>0){
            if(A[m-1]>B[n-1]){
                A[--index] = A[--m];
            }else{
                A[--index] = B[--n];
            }
        }
        while (n>0){
            A[--index] = B[--n];
        }
    }


}
