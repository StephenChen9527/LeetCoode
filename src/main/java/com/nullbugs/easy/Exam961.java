package com.nullbugs.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exam961 {

    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        if(A[A.length/2]==A[A.length/2+1]){
            return A[A.length/2];
        }else{
            return A[A.length/2-1];
        }

    }
    public int repeatedNTimes2(int[] A) {
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if(set.contains(A[i])){
                return A[i];
            }
            set.add(A[i]);
        }
        return 0;
    }
}
