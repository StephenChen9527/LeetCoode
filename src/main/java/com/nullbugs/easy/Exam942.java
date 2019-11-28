package com.nullbugs.easy;

import java.util.Arrays;

public class Exam942 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("IDID")));
    }

    public static int[] diStringMatch(String S) {
        int min=0;
        int max=S.length();
        int[] arr=new int[max+1];
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i)=='I'){
                arr[i]=min++;
            }else{
                arr[i]=max--;
            }

        }
        arr[S.length()]=max;
        return arr;
    }
}
