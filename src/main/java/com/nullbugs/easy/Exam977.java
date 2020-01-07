package com.nullbugs.easy;

import java.util.Arrays;

public class Exam977 {

    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i]=A[i]*A[i];
        }

        Arrays.sort(A);
        return A;
    }
}
