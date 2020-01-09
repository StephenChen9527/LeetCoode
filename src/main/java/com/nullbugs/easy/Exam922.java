package com.nullbugs.easy;

public class Exam922 {

    public int[] sortArrayByParityII(int[] A) {
        int[] arr=new int[A.length];
        int j=1;
        int o=0;
        for (int i = 0; i < A.length; i++) {
            if((A[i]&1)==1){
                arr[j]=A[i];
                j+=2;
            }else{
                arr[o]=A[i];
                o+=2;
            }
        }

        return arr;
    }
}
