package com.nullbugs.jianzhioffer;

import java.util.Arrays;

public class Exam17 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(3)));
    }

    public static int[] printNumbers(int n) {
        int max = 0;
        while (n-->0){
            int newMax = max*10 + 9 ;
            if(newMax/10!=max){
                return null;
            }
            max = newMax;
        }
        int[] arr = new int[max];
        for (int i = 0; i < arr.length;) {
            arr[i]=++i;
        }
        return arr;
    }

}
