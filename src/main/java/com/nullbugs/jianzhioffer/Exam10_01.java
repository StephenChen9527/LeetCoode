package com.nullbugs.jianzhioffer;

public class Exam10_01 {

    public void merge(int[] A, int m, int[] B, int n) {
        int indexA=A.length-B.length-1,indexB=B.length-1;
        for (int i=A.length-1;i>=0;i--){
            if(indexA<0){
                A[i]= B[indexB--];
            }else if(indexB<0){
                A[i] = A[indexA--];
            }else if(A[indexA]>B[indexB]){
                A[i] = A[indexA--];
            }else {
                A[i]= B[indexB--];
            }
        }


    }
}
