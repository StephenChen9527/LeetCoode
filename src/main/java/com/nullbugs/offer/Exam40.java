package com.nullbugs.offer;

import java.util.Arrays;

public class Exam40 {

    public int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < result.length; i++) {
            result[i]=arr[i];
        }
        return result;
    }
}
