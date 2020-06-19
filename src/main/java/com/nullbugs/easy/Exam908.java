package com.nullbugs.easy;

import java.util.Arrays;

public class Exam908 {

    public int smallestRangeI(int[] A, int K) {
        if(A.length==1){
            return 0;
        }
        Arrays.sort(A);
        int min = A[0];
        int max = A[A.length-1];

        return max-min-2*Math.abs(K)<0?0:max-min-2*Math.abs(K);
    }
}
